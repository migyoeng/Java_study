package book_study.api_class.wrapper_class;

public class BoxingMain {
    public static void main(String[] args) {
        //Boxing
        Integer int1 = new Integer(100);
        Integer int2 = new Integer("200");
        Integer int3 = Integer.valueOf("300");

        //Unboxing
        int value1 = int1.intValue();
        int value2 = int2.intValue();
        int value3 = int3.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }//main() end
}//class end
