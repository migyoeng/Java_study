package generic.ex4;

public class GenericMethod {
    //제네릭 메소드 사용

    //method
    public static Object objMethod(Object obj){
        System.out.println("object print: " + obj);
        return obj;
    }

    public static <T> T genericMethod(T t){
        System.out.println("generic print: " + t);
        return t;
    }

    public static <T extends Number> T numberMethod(T t){
        System.out.println("bound print: " + t);
        return t;
    }
}//class end
