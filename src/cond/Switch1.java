package cond;

import java.util.Scanner;

public class Switch1 {

    public static void main(String[] args) {
        //1:1000, 2:2000, 3:3000, 나머지 등급: 500
        Scanner sc = new Scanner(System.in);
        System.out.print("등급을 입력해주세요: ");
        int grade = sc.nextInt();

        int coupon;
        if(grade == 1){
            coupon = 1000;
        } else if(grade == 2){
            coupon = 2000;
        } else if(grade == 3){
            coupon = 3000;
        } else {
            coupon = 500;
        }//if end

        System.out.println("발급받은 쿠폰 " + coupon);

    }//main() end
}//class end
