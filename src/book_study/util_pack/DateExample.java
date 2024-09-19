package book_study.util_pack;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
    //Date 클래스 : 특정 시점의 날짜를 표현하는 클래스
    //Date 객체 : 특정 시점의 연도, 월, 일, 시간 정보 저장
    //현재 시각의 Date 객체 : Date now = new Date();
    //Date 객체의 toString() 메소드 : 영문으로 된 날짜 리턴
    //원하는 날짜 형식의 문자열 ex) SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
    //                                                  String strNow = sdf.format(now);

    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString();
        System.out.println(strNow1); //Wed Aug 28 08:53:08 KST 2024

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2); //2024년 08월 28일 08시 54분 21초
    }//main() end

}//class end
