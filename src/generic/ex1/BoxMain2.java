package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox(); //int,Integer 타입의 데이터만 저장하고 꺼낼 수 있는 인스턴스 생성
        integerBox.set(10);
        Integer integer = (Integer) integerBox.get(); //자식 타입 변수에 담기 위해 Object -> Integer 캐스팅
        System.out.println("integer = " + integer);

        ObjectBox stringBox = new ObjectBox(); //String 타입의 데이터만 저장하고 꺼낼 수 있는 인스턴스 생성
        stringBox.set("hello");
        String str = (String) stringBox.get(); //자식 타입 변수에 담기 위해 Object -> String 다운 캐스팅
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get(); //ClassCastException 예외 발생
        System.out.println("result = " + result);
        //모든 타입의 부모인 Object 클래스 덕분에 코드 중복을 해결했지만
        //타입을 다운 캐스팅해야하는 문제 발생
        //부모의 타입인 Object 이기 때문에 어떤 데이터를 저장해도 에러가 발생하지 않는 문제 발생
    }
}//class end
