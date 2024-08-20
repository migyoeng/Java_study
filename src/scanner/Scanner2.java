package scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력: ");
        int value1 = scanner.nextInt();
        System.out.print("두번째 숫자 입력: ");
        int value2 = scanner.nextInt();

        int sum = value1 + value2;
        System.out.println("두 수의 합: " + sum);
    }
}
