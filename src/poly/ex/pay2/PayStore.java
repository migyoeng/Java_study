package poly.ex.pay2;

public class PayStore {

    //결제 수단 추가시 변하는 부분
    public static Pay findPay(String option){
        if(option.equals("kakao")){
            return new KakaoPay();
        } else if(option.equals("naver")){
            return new NaverPay();
        } else if(option.equals("payco")){
            return new PaycoPay();
        } else {
            return new DefaultPay();
        }
    }//findPay() end
}
