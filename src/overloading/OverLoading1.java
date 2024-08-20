package overloading;

public class OverLoading1 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1,23,3));
    }

    //첫번째 add 메소드: 두 정수를 받아 합 반환
    public static int add(int a , int b){
        int sum = a + b;
        return sum;
    }

    //두번째 add 메소드: 세 정수를 받아 합 변환
    public static int add(int a, int b, int c){
        int sum = a + b + c;
        return sum;
    }
}
