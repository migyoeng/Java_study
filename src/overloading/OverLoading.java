package overloading;

public class OverLoading {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2,54.2));
    }

    //첫번째 add메소드: 두 정수를 받아서 합 반환
    public static int add(int a, int b){
        System.out.println("1번 호출");
        int sum = a + b;
        return sum;
    }

    //두번째 add 메소드: 두 실수의 합 반환
    public static double add(double a, double b){
        System.out.println("2번 호출");
        return a+b;
    }
}
