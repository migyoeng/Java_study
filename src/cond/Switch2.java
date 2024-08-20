package cond;

import java.util.Scanner;

public class Switch2 {

    public static void main(String[] args) {
        //1:1000, 2:2000, 3:3000, 나머지 등급: 500
        Scanner sc = new Scanner(System.in);
        System.out.print("등급을 입력해주세요: ");
        int grade = sc.nextInt();

        int coupon;
        //switch문 사용
        switch (grade){
            case 1: coupon = 1000; break;
            case 2: coupon = 2000; break;
            case 3: coupon = 3000; break;
            default: coupon = 500; break;
        }//switch end

        System.out.println("발급받은 쿠폰 " + coupon);

    }//main() end
}//class end
