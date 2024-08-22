package array;

public class ArrayRef1 {

    public static void main(String[] args) {
        //배열은 참조형
        int[] students; //배열 변수 선언
        students = new int[5];//배열 크기 정의와 함께 배열 생성
        //생성한 배열에 접근하기 위한 방법이 필요하다
        //배열 생성 시 반환되는 참조값을 변수에 담아둔다

        //값을 대입하기 전까지 배열 요소들은 타입에 따라
        //String = null, int = 0, boolean = false로 자동 초기화 된다

        //각 배열 요소에 값 대입, index 번호는 0부터 시작
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 50;
        students[4] = 40;

        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }//main() end
}//class end
