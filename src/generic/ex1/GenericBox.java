package generic.ex1;

public class GenericBox<T> {
    //GenericBox 클래스의 필드나 메소드의 타입을 클래스 생성 시 지정하지 않음
    //제네릭 타입 -> 인스턴스 생성 시 해당 클래스의 매개 타입 지정
    //T : 타입 매개변수, 인스턴스 생성 시 지정한 타입 : 타입 인자

    //field
    private T value;

    //method
    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}//class end
