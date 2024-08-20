package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
//        printNumber(number); 매개변수는 int형. double형 변수를 int형에 대입하므로 컴파일 오류남
        printNumber((int)number);
    }

    public static void printNumber(int n){
        System.out.println("숫자: " + n);
    }
}
