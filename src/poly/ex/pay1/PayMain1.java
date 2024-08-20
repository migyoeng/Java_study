package poly.ex.pay1;

public class PayMain1 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        String option1 = "kakao";
        int amount1 = 5000;
        payService.processPay(option1, amount1);

        //naver 결제
        String option2 = "naver";
        int amount2 = 10000;
        payService.processPay(option2, amount2);

        //잘못된 결제 수단 선택
        String option3 = "bad";
        int amount3 = 15000;
        payService.processPay(option3, amount3);
    }//main() end
}// class end
