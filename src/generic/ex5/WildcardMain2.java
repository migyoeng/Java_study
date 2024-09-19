package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<Cat>();

        //Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        writeBox(animalBox);
        //writeBox(dogBox); //Animal 타입보다 상위 타입만 대입 가능
        //writeBox(catBox);

        Animal animal = animalBox.get();
        System.out.println("animal = " + animal);
    }//main() end

    static void writeBox(Box<? super Animal> box){
        box.set(new Dog("김뽀뽀", 100));
    }
}//class end
