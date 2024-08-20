package cond.ex;

import java.util.Scanner;

public class ScoreEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력: ");
        int score = sc.nextInt();

        String grade = "";
        if(score <= 100 && score >= 90){
            grade = "A";
        } else if(score >= 80){
            grade = "B";
        } else if(score >= 70){
            grade = "C";
        } else if(score >= 60){
            grade = "D";
        } else {
            grade = "F";
        }//if end

        System.out.println("학점은 " + grade + "입니다");
    }//main() end
}//class end
