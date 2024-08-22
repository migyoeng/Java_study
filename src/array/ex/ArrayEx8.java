package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subject = {"국어","영어","수학"};
        System.out.print("학생 수를 입력하세요: ");
        int count = sc.nextInt();
        int[][] scores = new int[count][3];

        for(int i=0; i<count; i++){
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요");
            for(int j=0; j<scores[i].length; j++){
                System.out.print(subject[j] + "점수: ");
                scores[i][j] = sc.nextInt();
            }//for j end
        }//for i end


        for (int i = 0; i < count; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }//for j end
            double average = (double) total / subject.length;

            System.out.println((i+1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }//for i end


    }//main() end
}//class end
