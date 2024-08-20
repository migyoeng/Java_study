package array;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int input = scanner.nextInt();
        System.out.println(input + "개의 정수를 입력하세요");
        int[] numbers = new int[input];
        int sum = 0;
        for(int i = 0; i < input; i++){
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        double average = (double)sum/input;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);

    }
}
