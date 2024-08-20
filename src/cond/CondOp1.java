package cond;

import java.util.Scanner;

public class CondOp1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 입력: ");
        int age = sc.nextInt();
        String status;
        if(age > 18){
            status = "성인";
        } else {
            status = "미성년자";
        }//if end

        System.out.println("age=" + age + ", status=" + status);
    }//main() end
}//class end
