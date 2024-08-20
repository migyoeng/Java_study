package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("짹쨱");
    }

    @Override
    public void fly() {
        System.out.println("새가 날아다닙니다");
    }
}
