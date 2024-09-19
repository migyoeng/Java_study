package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

    public static void main(String[] args) {
        //부모 타입인 Animal로 다형성 시도
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 150);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        //문제 : 부모인 Animal 타입 지정으로 인해 서로 다른 타입 대입 가능
        //개 병원에 고양이 전달, 고양이 병원에 개 전달이 가능해지는 문제 발생
        dogHospital.set(cat); //매개변수 체크 실패 : 컴파일 오류가 발생하지 않음
        catHospital.set(dog);

        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.getBigger(new Dog("멍멍이", 200)); //부모 타입 반환으로 인해 자식 타입으로 캐스팅 필요
        System.out.println("biggerDog : " + biggerDog);

    }//main() end
}//class end
