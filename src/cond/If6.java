package cond;

import java.util.Scanner;

public class If6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("상품 가격을 입력하세요: ");
        int price = sc.nextInt();
        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        int discount = 0;

        if(price >= 10000){
            discount += 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if(age <= 10){
            discount += 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }//if end

        System.out.println("총 할인 금액: " + discount + "원");
    }//main() end
}//class end
