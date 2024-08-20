package scanner;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int count = 0;
        int number = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
//        while(true){
//            number = scanner.nextInt();
//            if(number == -1){
//                break;
//            }
//            total += number;
//            count++;
//        }

        while((number = scanner.nextInt()) != -1){
            total += number;
            count++;
        }
        System.out.println("입력한 숫자들의 합계: " + total);
        double average = (double)total/count;
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
