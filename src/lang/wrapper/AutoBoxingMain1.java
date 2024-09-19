package lang.wrapper;

public class AutoBoxingMain1 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value); //int -> Integer

        //Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue(); //Integer -> int

        System.out.println("boxedValue=" + boxedValue);
        System.out.println("unboxedValue=" + unboxedValue);
    }
}//class end
