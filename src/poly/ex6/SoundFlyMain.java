package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(dog);
        soundAnimal(bird);
        soundAnimal(chicken);

        //flyAnimal(dog); 에러 Fly 인터페이스를 구현하지 않음
        flyAnimal(bird);
        flyAnimal(chicken);
    }//main() end

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    private static void flyAnimal(Fly animal){
        System.out.println("날기 테스트 시작");
        animal.fly();
        System.out.println("날기 테스트 종료");
    }
}
