package book_study.exception1;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        //arguments 에 매개값 지정 시 예외가 발생하지 않는다
        String data1 = args[0];
        String data2 = args[1];

        System.out.println("args[0]: " + data1);
        System.out.println("args[1]: " + data2);
    }//main() end
}//class end
