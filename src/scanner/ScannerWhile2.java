package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자와 두번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");

        while(true){
            System.out.print("첫번째 숫자 입력: ");
            int value1 = scanner.nextInt();
            System.out.print("두번째 숫자 입력: ");
            int value2 = scanner.nextInt();

            if(value1 == 0 && value2 == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            int sum = value1 + value2;
            System.out.println("두 수의 합: " + sum);
        }
    }
}
