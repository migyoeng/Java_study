package cond.ex;

import java.util.Scanner;

public class ExchangeRateEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("환전 금액 입력: ");
        int dollar = sc.nextInt();

        if(dollar < 0){
            System.out.println("잘못된 금액입니다.");
        } else if(dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        } else {
            dollar *= 1300;
            System.out.println("환전 금액은 " + dollar + "원입니다.");
        }
    }//main() end
}//class end
