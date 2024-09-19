package generic.ex1;

public class StringBox {
    //String 타입의 필드를 저장하고 꺼낼 수 있는 클래스
    //field
    private String value;

    //method
    public void set(String value){
        this.value = value;
    }

    public String get(){
        return value;
    }
}//class end
