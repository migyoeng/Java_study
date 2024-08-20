package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("꼬끼오오오");
    }

    @Override
    public void fly() {
        System.out.println("닭이 날아다닙니다");
    }
}
