package Question_06;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<GroceryItemOrder> items;
    private static final int MAX_ITEMS = 10;

    public GroceryList() {
        items = new ArrayList<>();
    }

    public void add(GroceryItemOrder item) {
        if (items.size() < MAX_ITEMS) {
            items.add(item);
        } else {
            System.out.println("List is full. Cannot add more items.");
        }
    }

    public double getTotalCost() {
        double total = 0;
        for (GroceryItemOrder item : items) {
            total += item.getCost();
        }
        return total;
    }

    public void printList() {
        for (GroceryItemOrder item : items) {
            System.out.println(item);
        }
        System.out.println("Total cost: " + getTotalCost());
    }
}

