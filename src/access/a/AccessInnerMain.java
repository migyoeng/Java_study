package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 10;
        data.publicMethod();

        //default 호출 가능
        data.defaultField = 20;
        data.defaultMethod();

        //private 호출 불가
        //data.privateField = 30; //private 접근 제어로 인해 외부 클래스에서 접근 불가
        //data.privateMethod();

        data.innerAccess();
    }
}
