package cond;

import java.util.Scanner;

public class Switch3 {

    public static void main(String[] args) {
        //1:1000, 2:2000, 3:3000, 나머지 등급: 500
        Scanner sc = new Scanner(System.in);
        System.out.print("등급을 입력해주세요: ");
        int grade = sc.nextInt();

        int coupon;
        //switch문 사용
        switch (grade){
            case 1: coupon = 1000; break;
            case 2:
            case 3: coupon = 3000; break;
            default: coupon = 500; break;
        }//switch end
        //break문을 만나기 전까지 쭉 실행
        //break를 만나는 즉시 switch문을 빠져나간다

        System.out.println("발급받은 쿠폰 " + coupon);

    }//main() end
}//class end
