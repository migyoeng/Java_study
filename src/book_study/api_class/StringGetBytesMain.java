package book_study.api_class;

public class StringGetBytesMain {
    public static void main(String[] args) {
        String str = "Hello";

        byte[] bytes1 = str.getBytes();
        System.out.println("bytes1.length = " + bytes1.length);
        String str1 = new String(bytes1);
        System.out.println("bytes -> String : " + str1);
    }//main() end
}//class end
