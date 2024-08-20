package green.oop.objectarray;

public class Student1 {
    //멤버 변수 field
    private String name;
    private int kor, eng, math;
    private double average;

    //생성자 constructor
    public Student1() {}//기본 생성자 default constructor

    public Student1(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }//end

    //멤버 함수 method
    public void calculateAverage(){
        average = (kor+eng+math)/3.0;
    }//calculateAverage() end

    public void printStudent(){
        System.out.println("이름: " + name);
        System.out.println("국어: " + kor + ", 영어: " + eng + ", 수학: " + math);
        System.out.println("평균 점수: " + average);
    }//printStudent() end

}//class end
