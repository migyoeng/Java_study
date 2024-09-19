package book_study.api_class.ex;

import java.util.HashMap;

public class StudentMain {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<Student, String>();

        //new Student("1")의 점수 95 저장
        hashMap.put(new Student("1"), "95");

        //new Student("1")로 점수 읽어옴
        String score = hashMap.get(new Student("1"));
        System.out.println("1번 학생의 총점: " + score);
    }
}//class end
