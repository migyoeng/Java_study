package book_study.api_class;

public class SmartPhoneMain {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("google", "android");

        String value = myPhone.toString(); //google, android
        System.out.println(value);

        System.out.println(myPhone); //google, android
    }//main() end
}//class end
