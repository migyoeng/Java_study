package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV1 {
    //다형성 시도 -> 모든 동물의 부모 타입인 Animal 타입으로 코드 중복 제거
    //field
    private Animal animal;

    //method
    public void set(Animal animal){
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Animal getBigger(Animal target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}//class end
