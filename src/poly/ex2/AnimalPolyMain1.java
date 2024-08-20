package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog); //Dog 클래스에서 Animal의 sound()를 오버라이딩 했기때문에 Dog의 sound() 메서드 호출
        soundAnimal(cat);
        soundAnimal(cow);
    }//main() end

    //동물이 추가되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
