package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};

        //동물이 더 추가되어도 코드는 변하지 않는다
        for (Animal animal : animalArr) {
            animal.sound();
        }//for end
    }//main() end

    //동물이 추가되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
