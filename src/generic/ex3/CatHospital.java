package generic.ex3;

import generic.animal.Cat;

public class CatHospital {
    //field
    private Cat animal;

    //method
    public void set(Cat animal){
        this.animal = animal;
    }

    public void checkUp(){
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }

    public Cat bigger(Cat target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}//class end
