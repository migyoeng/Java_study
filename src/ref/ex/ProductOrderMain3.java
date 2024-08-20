package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orders = new ProductOrder[count];

       for(int i=0; i<count; i++){
           System.out.println((i+1) + "번째 주문 정보를 입력하세요");
           System.out.print("상품명: ");
           String productName = scanner.nextLine();
           System.out.print("가격: ");
           int price = scanner.nextInt();
           System.out.print("수량: ");
           int quantity = scanner.nextInt();
           scanner.nextLine();  //입력 버퍼를 지우기 위한 코드
           orders[i] = createOrder(productName, price, quantity);
       }

        printOrders(orders);

        int totalPrice = getTotalAmount(orders);
        System.out.println("총 결제 금액:" + totalPrice);
    }//main() end

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }//createOrder() end

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders) {
            System.out.println("상품명:" + order.productName + ", 가격:" + order.price + ", 수량:" + order.quantity);
        }//for end
    }//printOrders() end

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }//for end
        return totalAmount;
    }

}//class end
