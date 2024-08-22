package array.ex;

public class ArrayEx1Ref {

    public static void main(String[] args) {
        int[] students = new int[]{90,80,70,60,50};//new int[] 생략 가능

        int total = 0;//점수 총합
        //일반 for문
        /*for(int i=0; i<students.length; i++){
            total += students[i];
        }//for end
        */

        //향상된 for문 for-each문
        for(int student : students){
            total += student;
        }

        double average = (double) total / students.length; //점수 평균

        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }//main() end
}//class end
