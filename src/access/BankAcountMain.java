package access;

public class BankAcountMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.deposit(10000);
        account.withdraw(3000);
        System.out.println("balance = " + account.getBalance());
    }
}

//회원가입 시스템 작성 시
//필수 입력 : 생성자
//비밀번호 일치 확인 : private 메소드
