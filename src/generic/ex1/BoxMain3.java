package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        //제네릭의 핵심 포인트 : 내부에서 사용할 타입을 미리 결정하지 않는다
        //메소드의 매개 변수와 비슷 -> 메소드 호출 시 사용할 인자값 전달
        //제네릭타입 타입 매개 변수 -> 인스턴스 생성 시 사용할 타입 인자 지정
        //제네릭 타입 : 클래스나 인터페이스 정의 시 타입 매개변수를 사용하는 것 (클래스명 옆에 타입 매개변수 <T> 선언)
        //타입 매개변수 T : 제네릭 타입/제네릭 메소드에서 사용되는 변수, 실제 타입으로 대체
        //타입 매개변수에 기본형(int, double)은 지정 불가, wrapper 클래스로 지정 가능

        //Integer형의 데이터만 저장하고 꺼낼 수 있는 인스턴스 생성
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //인스턴스 생성 시점에 T의 타입 결정
        integerBox.set(100);
        //integerBox.set("문자100"); //컴파일 오류, Integer 타입만 저장 가능
        Integer integer = integerBox.get(); //Integer 타입 반환(캐스팅 필요X)
        System.out.println("integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>(); //인스턴스 생성 시점에 T 타입 결정
        stringBox.set("hello"); //String 타입만 저장 허용
        String str = stringBox.get(); //String 타입만 반환
        System.out.println("str = " + str);

        //원하는 모든 타입 지정 가능
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(10.55);
        Double doubleValue = doubleBox.get();
        System.out.println("doubleValue = " + doubleValue);

        //생성자 부분 제네릭 타입 생략 가능
        //타입 추론 : 자바가 스스로 타입 정보를 추론하여 개발자가 타입 정보를 생략할 수 있는 것
        GenericBox<Integer> integerBox2 = new GenericBox<>(); //생성자에 제네릭 타입 생략 가능
        integerBox2.set(850);
        Integer integer2 = integerBox2.get();
        System.out.println("integer2 = " + integer2);
    }//main() end
}//class end
