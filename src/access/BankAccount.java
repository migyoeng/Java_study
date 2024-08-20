package access;

public class BankAccount {
    //field
    private int balance;

    //constructor
    public BankAccount(){
        balance = 0;
    }

    //method()

    //public method: deposit
    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        } else{
            System.out.println("유효하지 않은 금액입니다");
        }
    }//deposit() end

    //public method: withdraw
    public void withdraw(int amount){
        if(isAmountValid(amount) && amount <= balance){
            balance -= amount;
        } else {
            System.out.println("잔액이 부족하거나 유효하지 않은 금액입니다");
        }
    }//withdraw() end

    //public method: getBalance
    public int getBalance(){
        return balance;
    }//getBalance() end

    //private method: isAmountValid
    private boolean isAmountValid(int amount){
        //금액이 0보다 커야함
        return amount > 0;
    }
}//class end
