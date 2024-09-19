package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog("김뽀보", 100);
        Cat cat = new Cat("야옹이", 120);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);
    }
}//class end
