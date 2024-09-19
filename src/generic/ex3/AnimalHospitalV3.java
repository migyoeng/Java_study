package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    //타입 매개변수 T의 타입을 Animal과 그 자식으로 범위 제한

    //field
    private T animal;

    //method
    public void set(T animal){
        this.animal = animal;
    }

    public void checkUp() {
        //타입 매개변수의 타입을 Animal과 그 자식으로 제한했기 때문에 Animal의 기능을 사용할 수 있다
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

}//class end
