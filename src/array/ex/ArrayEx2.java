package array.ex;

import java.util.Scanner;

public class ArrayEx2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("5개의 정수를 입력하세요:");

        for(int i=0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
            /*
            int num = sc.nextInt();
            numbers[i] = num;
            */
        }//for end

        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i]);
            if(i < numbers.length-1){
                System.out.print(", ");
            }//if end
        }//for end

    }//main() end
}//class end
