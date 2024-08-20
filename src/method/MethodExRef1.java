package method;

public class MethodExRef1 {
    public static void main(String[] args) {
//        double result1 = average(1,2,3);
//        System.out.println("평균값: " + result1);
//
//        double result2 = average(15,25,35);
//        System.out.println("평균값: " + result2);
        System.out.println("평균값: " + average(1,2,3));
        System.out.println("평균값: " + average(15,25,35));
    }

    public static double average(int a, int b, int c){
        int sum = a + b + c;
        return (double)sum/3;
    }
}
