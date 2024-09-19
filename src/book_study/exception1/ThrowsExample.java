package book_study.exception1;

public class ThrowsExample {

    public static void main(String[] args) {
        try {
            findClass();
        } catch(ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않습니다.");
        }//try end
    }//main() end

    public static void findClass() throws ClassNotFoundException{
        Class class1 = Class.forName("java.lang.String2");
    }//findClass() end
}//class end
