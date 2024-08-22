package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        //2x3 2차원 배열 생성
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };

        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); //한 행이 끝나면 라인 변경
        }
    }//main() end
}//class end
