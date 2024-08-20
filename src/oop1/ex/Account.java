package oop1.ex;

public class Account {
    int balance;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        if(amount > balance){
            System.out.println("잔액이 부족합니다");
            return;
        }
        balance -= amount;
    }

    void showBalance(){
        System.out.println("잔고:" + balance);
    }
}
