package poly.ex3;

public abstract class AbstractAnimal {//추상 메서드가 하나라도 있으면 클래스에도 abstract 키워드를 붙여줘야 한다

    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직입니다");
    }
}
