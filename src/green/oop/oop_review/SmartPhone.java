package green.oop.oop_review;

public class SmartPhone extends Product {

    //constructor
    public SmartPhone(){
        super(150);
        //부모 클래스에 상품 가격(price) 150 저장
    }

    @Override
    public String toString(){
        return "스마트폰";
    }//toString() end

}//class end
