package cond;

import java.util.Scanner;

public class If3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        if(age <= 7){
            System.out.println("미취학");
        } else if(age >= 8 && age <= 13){
            System.out.println("초등학생");
        } else if(age >= 14 && age <= 16){
            System.out.println("중학생");
        } else if(age >= 17 && age <= 19){
            System.out.println("고등학생");
        } else{
            System.out.println("성인");
        }

    }//main() end
}//class end
