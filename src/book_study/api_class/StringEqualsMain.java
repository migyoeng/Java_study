package book_study.api_class;

import java.util.Scanner;

public class StringEqualsMain {
    public static void main(String[] args) {
        String str1 = new String("신민철");
        String str2 = "신민철";

        if(str1 == str2){
            System.out.println("같은 String 객체 참조");
        } else {
            System.out.println("다른 String 객체 참조");
        }//if end

        if(str1.equals(str2)){
            System.out.println("같은 문자열을 가짐");
        } else {
            System.out.println("다른 문자열을 가짐");
        }//if end

    }//main() end
}//class end
