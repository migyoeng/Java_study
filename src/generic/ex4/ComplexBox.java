package generic.ex4;

import generic.animal.Animal;

public class ComplexBox<T extends Animal> {
    //field
    private T animal;

    //method
    public void set(T animal){
        this.animal = animal;
    }

    //제네릭 타입과 제네릭 메소드 동시에 존재하면 타입 매개변수명은 다르게 지정한다
    public <T> T printAndReturn(T t){
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + t.getClass().getName());
        //t.getName(); //호출 불가, 메소드는 <T extends Animal> 타입이 아니다
        //필드와 지역변수(매개변수) 우선 순위와 동일 적용
        return t;
    }
}//class end
