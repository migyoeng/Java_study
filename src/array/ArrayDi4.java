package array;

public class ArrayDi4 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        int i = 1;

        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 3; col++){
                arr[row][col] = i++;
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
