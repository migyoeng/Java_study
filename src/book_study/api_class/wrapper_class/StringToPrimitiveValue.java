package book_study.api_class.wrapper_class;

public class StringToPrimitiveValue {
    public static void main(String[] args) {
        int value1 = Integer.parseInt("100");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");

        System.out.println("value1: " + value1);
        System.out.println("value2: " + value2);
        System.out.println("value3: " + value3);
    }//main() end
}//class end
