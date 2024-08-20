package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            System.out.println(number);
        }
        System.out.println("--------------------------------------");

        for(int number : numbers){      //단축어 : iter
            System.out.println(number);
        }
    }
}
