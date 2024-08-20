package green.oop.oop_review;

public class ShopMain {

    public static void main(String[] args) {
        //상품 구매(Customer), 반품(Order) 프로그램 만들기
        //1) 상품 만들기 - 클래스 생성

        //2) 상품 진열하기
        SmartTV tv = new SmartTV();
        NoteBook note = new NoteBook();
        SmartPhone phone = new SmartPhone();

        //3) 상품 구매하기
        Customer customer1 = new Customer();

        customer1.buy(tv);
        customer1.buy(note);
        customer1.buy(phone);
        customer1.buy(note);
        customer1.buy(note);

        customer1.print();

        System.out.println("-------------------------------------------------------------");

        //반품
        Order customer2 = new Order();
//        customer2.buy(tv);
//        customer2.buy(note);
//        customer2.buy(phone);
//        customer2.buy(note);

        customer2.print();

        customer2.refund(note);
        customer2.print();

    }//main() end
}//class end
