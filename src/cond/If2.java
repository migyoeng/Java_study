package cond;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        //int age = 20; //사용자 나이
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println(age + "세, 성인입니다.");
        } else {
            System.out.println(age + "세, 미성년자입니다.");
        }
        
    }//main() end
}//class end
