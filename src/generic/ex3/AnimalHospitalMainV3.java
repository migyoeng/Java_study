package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>(); //Dog 타입만 저장 가능
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        Dog dog = new Dog("멍멍이1", 100);
        Dog bbo = new Dog("김뽀뽀", 60);
        Cat cat = new Cat("야옹이", 150);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();
        dogHospital.set(bbo);
        dogHospital.checkUp();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        //문제1 해결: 개 병원에 고양이 전달
        //dogHospital.set(cat); //컴파일 오류

        dogHospital.set(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }//main() end
}//class end
