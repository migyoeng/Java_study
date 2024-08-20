package access.ex;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(2);

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);
        Item item3 = new Item("오이", 1000, 4);


        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);


        cart.displayItems();
    }
}
