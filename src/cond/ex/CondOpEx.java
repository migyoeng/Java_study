package cond.ex;

import java.util.Scanner;

public class CondOpEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자1 입력: ");
        int a = sc.nextInt();
        System.out.print("숫자2 입력: ");
        int b = sc.nextInt();

        int result = (a>b)? a:b;

        System.out.println("더 큰 숫자는 " + result + "입니다.");
    }//main() end
}//class end
