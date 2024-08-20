package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // == null.value = 10
        System.out.println("data = " + data.value);

        //data는 null을 가지고있음 = 참조값을 가지지 않고 있다
        //data는 참조할 객체 인스턴스가 존재하지 않음
        //Data 클래스의 필드인 value에 접근할 수 없다는 의미
    }
}
