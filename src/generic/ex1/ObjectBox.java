package generic.ex1;

public class ObjectBox {
    //모든 타입을 담을 수 있는 Object 타입의 클래스 생성 -> 다형성을 활용함으로써 코드 중복은 줄일 수 있다
    //field
    private Object value;

    //method
    public void set(Object value){
        this.value = value;
    }

    public Object get(){
        return value;
    }
}//class end
