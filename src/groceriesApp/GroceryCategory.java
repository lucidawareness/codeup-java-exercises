package groceriesApp;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class GroceryCategory {
    private final String name;
    private final HashMap<String, Integer> items = new HashMap<>();

    public GroceryCategory(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void getItems() {
        Map<String, Integer> treeMap = new TreeMap<>(items);
        for (String item : treeMap.keySet()) {
            Integer quantity = items.get(item);
            System.out.printf("Item: %s, QTY: %d\n", item, quantity);
        }
    }

    public void addItems(String itemName, int qty) {
        this.items.put(itemName, qty);
    }
}
