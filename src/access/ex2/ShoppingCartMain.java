package access.ex2;

import java.util.Scanner;

public class ShoppingCartMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("장바구니에 입력할 상품의 개수를 입력하세요: ");
        int maxCount = sc.nextInt();

        ShoppingCart cart = new ShoppingCart(maxCount);

        int count = 0;

        Item item1 = new Item("마늘", 2000, 2);
        Item item2 = new Item("상추", 3000, 4);
        Item item3 = new Item("오이", 1000, 4);


        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);


        cart.displayItems();
    }
}
