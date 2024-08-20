package poly.diamond;

//인터페이스 다중 구현
public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        //부모 타입이 뭐든 기능 구현은 자식에서 하므로 상관없음
    }
}
