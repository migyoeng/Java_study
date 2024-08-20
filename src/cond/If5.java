package cond;

public class If5 {

    public static void main(String[] args) {
        int price = 10000; //아이템 가격
        int age = 10; //나이
        int discount = 0; //할인 금액

        if(price >= 10000){
            discount += 1000;
        }//if end

        if(age <= 10){
            discount += 1000;
        }//if end

        System.out.println("총 할인 금액: " + discount + "원");
    }//main end
}//class end
