package book_study.util_pack;

import java.util.Calendar;

public class CalendarExample {
    //Calendar 클래스 : 달력을 표현한 추상 클래스 -> new 연산자를 통한 직접 객체 생성 불가능
    //Calendar now = Calendar.getInstance();
    // -> 메소드를 통해 현재 운영체제에 설정되어있는 시간대를 기준으로 한 Calendar 하위 객체를 얻을 수 있다
    // Calendar 객체를 얻은 후 get() 메소드를 통해 날짜와 시간 정보를 읽을 수 있다

    public static void main(String[] args) {
        Calendar now = Calendar.getInstance(); //운영체제에 설정된 시간 가져오기

        int year = now.get(Calendar.YEAR); //1 연도 리턴
        int month = now.get(Calendar.MONTH)+1; //2 월 리턴
        int day = now.get(Calendar.DAY_OF_MONTH); //5 일 리턴

        int week = now.get(Calendar.DAY_OF_WEEK); //7 요일 리턴
        String strWeek = null;

        //요일 구하기
        switch (week){
            case Calendar.MONDAY:
                strWeek = "월";
                break;
            case Calendar.TUESDAY:
                strWeek = "화";
                break;
            case Calendar.WEDNESDAY:
                strWeek = "수";
                break;
            case Calendar.THURSDAY:
                strWeek = "목";
                break;
            case Calendar.FRIDAY:
                strWeek = "금";
                break;
            case Calendar.SATURDAY:
                strWeek = "토";
                break;
            case Calendar.SUNDAY:
                strWeek = "일";
                break;
        }//switch end

        //오전/오후 구하기
        int amPm = now.get(Calendar.AM_PM); //9 오전/오후 반환
        String strAmPm = null;
        if(amPm == Calendar.AM){ //0
            strAmPm = "오전";
        } else {
            strAmPm = "오후"; //Calendar.PM = 1
        }//if end

        int hour = now.get(Calendar.HOUR); //10 시 반환
        int minute = now.get(Calendar.MINUTE); //12 분 반환
        int second = now.get(Calendar.SECOND); //13 초 반환

        System.out.print(year + "년");
        System.out.print(month + "월");
        System.out.print(day + "일");
        System.out.println(strWeek + "요일");
        System.out.print(strAmPm + " ");
        System.out.print(hour + "시");
        System.out.print(minute + "분");
        System.out.print(second + "초");


    }//main() end

}//class end
