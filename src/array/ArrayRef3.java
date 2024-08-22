package array;

public class ArrayRef3 {

    public static void main(String[] args) {
        int[] students;
        students = new int[]{90,80,70,60,50};//배열 생성과 초기화를 동시에

        for(int i=0; i<students.length; i++){
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }//for end

    }//main() end
}//class end
