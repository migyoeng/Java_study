package final1;

public class FinalLocalMain {

    public static void main(String[] args) {

        //final 지역 변수1
        final int data1;
        data1 = 10; //최초 한번만 할당 가능
        //data1 = 20; //compile error, 값을 수정할 수 없음

        //final 지역 변수2
        final int data2 = 10;
        //data2 = 20; //compile error, 값을 수정할 수 없음

        method(10);
    }//main() end

    static void method(final int parameter){
        //parameter = 20; //compile error, 매개변수에 값이 할당되면 해당 메소드 내에서 값을 변경할 수 없음
    }
}//class end
