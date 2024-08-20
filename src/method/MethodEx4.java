package method;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;
        int amount;

        while(true){
            System.out.print("1. 입금 2. 출금 3. 잔액 확인 4. 종료 \n 선택: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if(menu == 1){
                System.out.print("입금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance = deposit(balance,amount);
            } else if(menu == 2){
                System.out.print("출금액을 입력하세요: ");
                amount = scanner.nextInt();
                balance = withdraw(balance,amount);
            } else if(menu == 3){
                System.out.println("현재 잔액: " + balance + "원");
            } else if(menu == 4){
                System.out.println("종료합니다.");
                break;
            } else{
                System.out.println("잘못 선택하셨습니다");
            }
        }
    }

    //입금 메소드
    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    //출금 메소드
    public static int withdraw(int balance, int amount){
        if(amount > balance){
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return balance;
        } else{
            balance -= amount;
            System.out.println(amount + "원을 출금했습니다. 현재 잔액: " + balance + "원");
            return balance;
        }
    }
}
