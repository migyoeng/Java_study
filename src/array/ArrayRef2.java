package array;

public class ArrayRef2 {

    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[5];//배열 크기 정의와 함께 배열 생성

        //각 배열 요소에 값 대입, index 번호는 0부터 시작
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 50;
        students[4] = 40;

        //배열의 길이를 활용하여 for문 사용
        for(int i=0; i<students.length; i++){
            System.out.println("학생" + (i+1) + " 점수: " + students[i]);
        }//for end

    }//main() end
}//class end
