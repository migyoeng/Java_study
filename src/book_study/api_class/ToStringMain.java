package book_study.api_class;

import java.util.Date;

public class ToStringMain {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Date date1 = new Date();
        String value = "hello java";

        System.out.println(obj1); //obj1의 참조값
        System.out.println(date1); //현재 날짜와 시간
        System.out.println(value); //hello java
    }//main() end
}//class end
