package green.oop.final1;

public class Dog extends Animal {
  /*
    @Override
    public void move() {
        System.out.println("강아지가 이동합니다");
    }
  */
    //에러 부모 클래스의 move()메소드는 final로 지정되어있기때문에
    //자식 클래스에서 재정의 불가능

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
