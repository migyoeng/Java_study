package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        //코드 중복의 문제점 발생 -> 새로운 동물이 추가될 때마다 같은 내용의 클래스를 생성해야 한다 -> 유지보수도 힘들어짐
        DogHospital dogHospital = new DogHospital(); //Dog 타입만 저장 가능
        CatHospital catHospital = new CatHospital(); //Cat 타입만 저장 가능

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 50);

        //개 병원
        dogHospital.set(dog);
        dogHospital.checkUp();

        //고양이 병원
        catHospital.set(cat);
        catHospital.checkUp();

        //컴파일 오류. 다른 타입 대입
        //-> 타입 안전성은 지킬 수 있다
        //dogHospital.set(cat);
        //catHospital.set(dog);

        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 150));
        System.out.println("biggerDog = " + biggerDog);
    }//main() end

}//class end
