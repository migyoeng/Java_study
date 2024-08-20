package green.oop.oop_review;

public class NoteBook extends Product {

    //constructor
    public NoteBook(){
        super(200);//상품 가격 200
        //부모 클래스의 필드 price에 200 저장
    }

    @Override
    public String toString(){
        return "노트북";//상품명
    }//toString() end
}//class end
