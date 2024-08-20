package method;

public class MethodEx3 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = deposit(balance,1000);
        balance = withdraw(balance,2000);

        System.out.println("최종 잔액: " + balance + "원");
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
            System.out.println(amount + "원을 출금하려했으나 잔액이 부족합니다.");
            return balance;
        } else {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
            return balance;
        }
    }
}
