package book_study.exception1;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);
    }//main() end

    public static void changeDog(Animal animal){
        if(animal instanceof Dog) { //매개변수로 전달받은 animal변수가 Dog 인스턴스로 변환이 가능한지?
            Dog dog = (Dog) animal; //ClassCastException 발생 가능
        }//if end
    }//changeDog() end

}//class end

class Animal{}//class end
class Dog extends Animal{}//class end
class Cat extends Animal{}//class end
