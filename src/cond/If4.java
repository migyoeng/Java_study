package cond;

import java.util.Scanner;

public class If4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = sc.nextInt();

        //조건에 맞는 if~else문을 만나면 다음 else if, else문은 실행하지 않는다
        if(age <= 7){
            System.out.println("미취학");
        } else if(age <= 13){
            System.out.println("초등학생");
        } else if(age <= 16){
            System.out.println("중학생");
        } else if(age <= 19){
            System.out.println("고등학생");
        } else{
            System.out.println("성인");
        }

    }//main() end
}//class end
