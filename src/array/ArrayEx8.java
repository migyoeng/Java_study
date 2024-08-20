package array;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요: ");
        int count = scanner.nextInt();

        String[] subjects = {"국어","영어","수학","과학"};
        int[][] scores = new int[count][subjects.length];

        for(int i = 0; i < count; i++){
            System.out.println((i+1) + "번 학생의 성적을 입력하세요");
            for(int j = 0; j < subjects.length; j++){
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < count; i++){
            int sum = 0;
            double average;
            for(int j = 0; j < subjects.length; j++){
                sum += scores[i][j];
            }
            average = (double)sum/ subjects.length;

            System.out.println((i+1) + "학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
