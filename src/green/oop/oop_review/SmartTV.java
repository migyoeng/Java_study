package green.oop.oop_review;

public class SmartTV extends Product {

    //constructor
    public SmartTV(){
        super(100);//상품 가격 100 - Product 필드인 price에 저장
        //= super.price = 100;
    }//end

    @Override
    public String toString() {
        return "스마트TV";
    }//toString() end

}//class end
