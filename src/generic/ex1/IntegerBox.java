package generic.ex1;

public class IntegerBox {
    //Integer타입의 필드를 저장하고 꺼낼 수 있는 클래스
    //field
    private Integer value;

    //method
    public void set(Integer value){
        this.value = value;
    }

    public Integer get(){
        return value;
    }
}//class end
