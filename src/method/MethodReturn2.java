package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        checkAge(10);
        checkAge(25);
    }

    public static void checkAge(int age){
        if(age < 18){
            System.out.println(age + "살, 입장할 수 없습니다.");
            return; //return문 만나면 바로 해당 메소드 빠져나감
        }
        System.out.println(age + "살, 입장하세요");

    }
}
