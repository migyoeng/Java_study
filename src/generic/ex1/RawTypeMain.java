package generic.ex1;

public class RawTypeMain {

    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); //Object 타입으로 자동 지정되지만 권장하지 않는 작성 방법
        //GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }//main() end
}//class end
