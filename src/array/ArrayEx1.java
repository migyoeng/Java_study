package array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int sum = 0;

        for(int i = 0; i < students.length; i++){
            sum += students[i];
        }
        double average = (double)sum/students.length;

        System.out.println("점수 총합 = " + sum);
        System.out.println("점수 평균 = " + average);
    }
}
