package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.print("숫자를 입력하세요: ");
            int value = scanner.nextInt();
            if(value == 0){
                System.out.println("프로그램 종료");
                break;
            }
            sum += value;
        }
        System.out.println("합: " + sum);
    }
}
