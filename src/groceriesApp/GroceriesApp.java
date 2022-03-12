package groceriesApp;

import util.Input;

import java.util.ArrayList;
//import java.util.Scanner;

public class GroceriesApp {
//    static Scanner scanner = new Scanner(System.in);

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

    public static void printCategories(ArrayList<GroceryCategory> categories) {
        int count = 0;
        for (GroceryCategory category : categories) {
            count += 1;
            System.out.println(count + "- " + category.getName());
        }
    }

    public static void runApp(ArrayList<GroceryCategory> categories) {
        if (Input.yesNo("Would you like to create a grocery list? (y/n)")) {
            userChooseCategoryToAddTo(categories);
        } else {
            System.out.println("Goodbye!");
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
//        edit list items
        }
    }

    private static void userChooseListDisplay(ArrayList<GroceryCategory> categories) {
        System.out.println("How would you like your list?");
        System.out.println("Enter: \"1\" to show all, \"2\" Beverages, \"3\" Bakery, \"4\" Canned/Jared, \"5\" Dairy\n" +
                "\"6\" Dry/Baking Goods, \"7\" Frozen Foods, \"8\" Meat, \"9\" Produce\n" +
                "\"10\" Cleaners, \"11\" Paper Goods, \"12\" Personal Care, \"13\" Other\n");
        String userListDisplayChoice = Input.getString("Choose a category to add to.");
        System.out.println("Here is you list!\n");
        if (userListDisplayChoice.equalsIgnoreCase("1")) {
            for (GroceryCategory category : categories) {
                System.out.printf("%s:\n", category.getName());
                category.getItems();
            }
            askUserProceed(categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("2")) {
            GroceryCategory category = categories.get(0);
            printListDisplay(category, categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("3")) {
            GroceryCategory category = categories.get(1);
            printListDisplay(category, categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("4")) {
            GroceryCategory category = categories.get(2);
            printListDisplay(category, categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("5")) {
            GroceryCategory category = categories.get(3);
            printListDisplay(category, categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("6")) {
            GroceryCategory category = categories.get(4);
            printListDisplay(category, categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("7")) {
            GroceryCategory category = categories.get(5);
            printListDisplay(category, categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("8")) {
            GroceryCategory category = categories.get(6);
            printListDisplay(category, categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("9")) {
            GroceryCategory category = categories.get(7);
            printListDisplay(category, categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("10")) {
            GroceryCategory category = categories.get(8);
            printListDisplay(category, categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("11")) {
            GroceryCategory category = categories.get(9);
            printListDisplay(category, categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("12")) {
            GroceryCategory category = categories.get(10);
            printListDisplay(category, categories);
        } else if (userListDisplayChoice.equalsIgnoreCase("13")) {
            GroceryCategory category = categories.get(11);
            printListDisplay(category, categories);
        } else {
            System.out.println("Not a proper input");
            askUserProceed(categories);
        }
    }

    private static void printListDisplay(GroceryCategory category, ArrayList<GroceryCategory> categories) {
        System.out.printf("%s:\n", category.getName());
        category.getItems();
        askUserProceed(categories);

    }

    private static void userChooseCategoryToAddTo(ArrayList<GroceryCategory> categories) {
        printCategories(categories);
        String userCategoryChoice = Input.getString("Choose a category to add to");
        if (userCategoryChoice.equalsIgnoreCase("1")) {
            GroceryCategory category = categories.get(0);
            addNewItem(category, categories);
        } else if (userCategoryChoice.equalsIgnoreCase("2")) {
            GroceryCategory category = categories.get(1);
            addNewItem(category, categories);
        } else if (userCategoryChoice.equalsIgnoreCase("3")) {
            GroceryCategory category = categories.get(2);
            addNewItem(category, categories);
        } else if (userCategoryChoice.equalsIgnoreCase("4")) {
            GroceryCategory category = categories.get(3);
            addNewItem(category, categories);
        } else if (userCategoryChoice.equalsIgnoreCase("5")) {
            GroceryCategory category = categories.get(4);
            addNewItem(category, categories);
        } else if (userCategoryChoice.equalsIgnoreCase("6")) {
            GroceryCategory category = categories.get(5);
            addNewItem(category, categories);
        } else if (userCategoryChoice.equalsIgnoreCase("7")) {
            GroceryCategory category = categories.get(6);
            addNewItem(category, categories);
        } else if (userCategoryChoice.equalsIgnoreCase("8")) {
            GroceryCategory category = categories.get(7);
            addNewItem(category, categories);
        } else if (userCategoryChoice.equalsIgnoreCase("9")) {
            GroceryCategory category = categories.get(8);
            addNewItem(category, categories);
        } else if (userCategoryChoice.equalsIgnoreCase("10")) {
            GroceryCategory category = categories.get(9);
            addNewItem(category, categories);
        } else if (userCategoryChoice.equalsIgnoreCase("11")) {
            GroceryCategory category = categories.get(10);
            addNewItem(category, categories);
        } else if (userCategoryChoice.equalsIgnoreCase("12")) {
            GroceryCategory category = categories.get(11);
            addNewItem(category, categories);
        } else {
            System.out.println("Not a proper input");
            askUserProceed(categories);
        }
    }

    private static void addNewItem(GroceryCategory category, ArrayList<GroceryCategory> categories) {
        System.out.printf("Adding to category: %s\n", category.getName());
        String itemName = Input.getString("Item name?");
        int itemQty = Input.getInt("Item QTY?");
        category.addItems(itemName, itemQty);
        System.out.println("Item has been added!");
        askUserProceed(categories);

    }
}
