package book_study.api_class.wrapper_class;

public class AutoBoxingMain {
    public static void main(String[] args) {
        //Auto boxing
        Integer int1 = 100;
        System.out.println("value: " + int1.intValue());

        //대입 시 자동 언박싱
        int value = int1;
        System.out.println("value: " + value);

        //연산 시 자동 언박싱
        int result = value + 100;
        System.out.println("result: " + result);
    }//main() end
}//class end
