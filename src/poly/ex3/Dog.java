package poly.ex3;

public class Dog extends AbstractAnimal{

    //추상 클래스를 상속받을땐 반드시 추상 메소드를 오버라이드 해줘야함
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
