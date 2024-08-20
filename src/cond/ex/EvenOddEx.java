package cond.ex;

import java.util.Scanner;

public class EvenOddEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");
        int num = sc.nextInt();

        String result = (num%2 == 0)? "짝수" : "홀수";

        System.out.println("num = " + num + ", " + result);
    }//main() end
}//class end
