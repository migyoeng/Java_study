package generic.ex5;

import generic.animal.Animal;

public class WildcardEx {
    //와일드카드 ?
    //이미 만들어진 제네릭 타입을 활용할 때 사용

    //제네릭 메소드
    static <T> void printGenericV1(Box<T> box){
        System.out.println("T = " + box.get());
    }

    //일반 메소드
    static void printWildcardV1(Box<?> box){
        System.out.println("? = " + box.get());
    }

    //상한 와일드카드, Animal을 상한으로 제한
    static <T extends Animal> void printGenericV2(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
    }

    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box){
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box){
        Animal animal = box.get();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}//class end
