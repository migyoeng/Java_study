package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자 입력: ");
        int value1 = scanner.nextInt();
        System.out.print("두번째 숫자 입력: ");
        int value2 = scanner.nextInt();

        if(value1 > value2){
            System.out.println("더 큰 수:" + value1);
        } else if(value1 < value2){
            System.out.println("더 큰 수:" + value2);
        } else{
            System.out.println("두 수의 크기가 같습니다.");
        }
    }
}
