package method;

public class MethodExRef2 {
    public static void main(String[] args) {
        printMessage("hello java!!", 3);
        printMessage("hi bbo bbo~~", 5);
        printMessage("hello world", 7);
    }

    public static void printMessage(String message, int count){
        for(int i = 0; i < count; i++){
            System.out.println(message);
        }
    }
}
