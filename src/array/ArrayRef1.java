package array;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] student;
        student = new int[5];

        student[0] = 90;
        student[1] = 80;
        student[2] = 70;
        student[3] = 60;
        student[4] = 50;

        System.out.println("학생1 점수: " + student[0]);
        System.out.println("학생2 점수: " + student[1]);
        System.out.println("학생3 점수: " + student[2]);
        System.out.println("학생4 점수: " + student[3]);
        System.out.println("학생5s 점수: " + student[4]);
        System.out.println(student);
    }
}
