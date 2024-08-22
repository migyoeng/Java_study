package array;

public class ArrayRef4 {

    public static void main(String[] args) {
        //배열 선언, 생성, 초기화를 동시에
        int[] students = {90,80,70,60,50};

        for(int i=0; i<students.length; i++){
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }
    }//main() end
}//class end
