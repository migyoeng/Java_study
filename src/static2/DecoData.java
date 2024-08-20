package static2;

public class DecoData {
    //static 메소드는 static만 사용 가능하다
    //클래스 내부 기능 사용 시, 정적 메소드는 static이 붙은 메소드나 변수만 사용 가능
    //반대로 static은 모든 곳에서 호출될 수 있다

    //field
    private int instanceValue;
    private static int staticValue;

    //method
    public static void staticCall(){
        //instancValue++; //인스턴스 변수 접근, compile error
        //instanceMethod(); //인스턴스 메소드 접근, compile error
        staticValue++;
        staticMethod();
    }

    public void instanceCall(){
        instanceValue++; //인스턴스 변수 접근
        instanceMethod(); //인스턴스 메소드 접근

        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메소드 접근
    }

    //추가
    public static void staticCall(DecoData data){
        data.instanceValue++;
        data.instanceMethod();
        //참조값을 직접 전달하면 인스턴스 변수나 메서드를 호출 가능
    }

    private void instanceMethod(){
        System.out.println("instanceValue= " + instanceValue);
    }
    private static void staticMethod(){
        System.out.println("staticValue= " + staticValue);
    }
}
