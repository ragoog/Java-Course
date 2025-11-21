package Question_06;
public class Main {
    public static void main(String[] args) {
        GroceryList list = new GroceryList();

        GroceryItemOrder apples = new GroceryItemOrder("Apples", 2.5);
        apples.setQuantity(4);

        GroceryItemOrder milk = new GroceryItemOrder("Milk", 1.75);
        milk.setQuantity(2);

        GroceryItemOrder bread = new GroceryItemOrder("Bread", 3.0);
        bread.setQuantity(1);

        list.add(apples);
        list.add(milk);
        list.add(bread);

        list.printList();
    }
}


