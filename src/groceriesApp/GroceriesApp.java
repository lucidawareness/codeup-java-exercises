package groceriesApp;

import util.Input;

import java.util.ArrayList;

public class GroceriesApp {

    public static void main(String[] args) {
        ArrayList<GroceryCategory> categories = new ArrayList<>();
        GroceryCategory category = new GroceryCategory("Beverages");
        categories.add(category);
        GroceryCategory bakery = new GroceryCategory("Bakery");
        categories.add(bakery);
        GroceryCategory cannedJared = new GroceryCategory("Canned/Jared");
        categories.add(cannedJared);
        GroceryCategory dairy = new GroceryCategory("Dairy");
        categories.add(dairy);
        GroceryCategory dryOrBakingGoods = new GroceryCategory("Dry/Baking Goods");
        categories.add(dryOrBakingGoods);
        GroceryCategory frozenFoods = new GroceryCategory("Frozen Foods");
        categories.add(frozenFoods);
        GroceryCategory meat = new GroceryCategory("Meat");
        categories.add(meat);
        GroceryCategory produce = new GroceryCategory("Produce");
        categories.add(produce);
        GroceryCategory cleaners = new GroceryCategory("Cleaners");
        categories.add(cleaners);
        GroceryCategory paperGoods = new GroceryCategory("Paper Goods");
        categories.add(paperGoods);
        GroceryCategory personalCare = new GroceryCategory("Personal Care");
        categories.add(personalCare);
        GroceryCategory other = new GroceryCategory("Other");
        categories.add(other);


        runApp(categories);
    }

    public static void runApp(ArrayList<GroceryCategory> categories) {
        if (Input.yesNo("Would you like to create a grocery list? (y/n)")) {
            userChooseCategoryToAddTo(categories);
        } else {
            System.out.println("Goodbye!");
        }
    }

    private static void userChooseCategoryToAddTo(ArrayList<GroceryCategory> categories) {
        printCategories(categories);
        int userCategoryChoice = Input.getInt(1, 12, "Choose a category to add to \n");
        if (userCategoryChoice > 12 || userCategoryChoice < 0) {
            System.out.println("Choose an option between 1 and 12 from above");
        }
        GroceryCategory category = categories.get(userCategoryChoice - 1);
        addNewItem(category, categories);
    }

    private static void addNewItem(GroceryCategory category, ArrayList<GroceryCategory> categories) {
        System.out.printf("Adding to category: %s\n", category.getName());
        String itemName = Input.getString("Item name?");
        int itemQty = Input.getInt("Item QTY?");
        category.addItems(itemName, itemQty);
        System.out.println("Item has been added!");
        askUserProceed(categories);
    }

    private static void userChooseListDisplay(ArrayList<GroceryCategory> categories) {
        listDisplayOptions(categories);

        int userListDisplayChoice = Input.getInt(1, 13, "Choose how to display your list\n");
        System.out.println("Here is you list!\n");
        if (userListDisplayChoice > 13 || userListDisplayChoice <= 0) {
            System.out.println("Please input a number from the options above");
            userChooseListDisplay(categories);
        } else if (userListDisplayChoice == 1) {
            for (GroceryCategory category : categories) {
                System.out.printf("%s:\n", category.getName());
                category.getItems();
            }
            askUserProceed(categories);
        } else {
            GroceryCategory category = categories.get(userListDisplayChoice - 2);
            printListDisplay(category, categories);
        }
    }

    private static void printListDisplay(GroceryCategory category, ArrayList<GroceryCategory> categories) {
        System.out.printf("%s:\n", category.getName());
        category.getItems();
        askUserProceed(categories);
    }

    public static void printCategories(ArrayList<GroceryCategory> categories) {
        int count = 0;
        for (GroceryCategory category : categories) {
            count += 1;
            System.out.println(count + "- " + category.getName());
        }
    }

    public static void listDisplayOptions(ArrayList<GroceryCategory> categories) {
        int count = 1;
        System.out.println("How would you like your list?");
        System.out.println("1- Show all");
        for (GroceryCategory category : categories) {
            count += 1;
            System.out.println(count + "- " + category.getName());
        }
    }

    public static void askUserProceed(ArrayList<GroceryCategory> categories) {
        if (Input.yesNo("Would you like to add more to the grocery list? (y/n)")) {
            userChooseCategoryToAddTo(categories);
        } else {
            if (Input.yesNo("Do you want to see your list?(y) Or Exit(n)")) {
                userChooseListDisplay(categories);
            } else {
                System.out.println("Goodbye!");
            }
        }
    }
}
