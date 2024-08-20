package cond;

import java.util.Scanner;

public class Switch4 {

    public static void main(String[] args) {
        //1:1000, 2:2000, 3:3000, 나머지 등급: 500
        Scanner sc = new Scanner(System.in);
        System.out.print("등급을 입력해주세요: ");
        int grade = sc.nextInt();

        //자바 14부터 새로 도입된 switch문
        int coupon = switch (grade){
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        }; //내부 객체랑 비슷

        System.out.println("발급받은 쿠폰 " + coupon);

    }//main() end
}//class end
