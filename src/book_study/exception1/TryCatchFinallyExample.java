package book_study.exception1;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            Class class1 = Class.forName("java.lang.String2");
        } catch(ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않습니다.");
        }//try end
    }//main() end
}//class end
