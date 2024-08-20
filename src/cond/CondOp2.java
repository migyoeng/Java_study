package cond;

import java.util.Scanner;

public class CondOp2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        //삼항 연산자
        //조건식? 참일 때 값 : 거짓일 때 값
        String status = (age >= 18)? "성인" : "미성년자";

        System.out.println("age=" + age + ", status= " + status);
    }
}//class end
