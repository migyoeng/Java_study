package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);

        boolean result2 = odd(5);
        System.out.println(result2);
    }

    public static boolean odd(int i ){
        if(i%2 == 1){
            return true;
        } else return false;
    }
}
