package poly.basic;

//다형적 참조 : 부모는 자식을 품을 수 있다
public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        poly.parentMethod();
        
        //Child child1 = new Parent(); //자식은 부모를 담을 수 없다
        
        //poly.childMethod(); //자식의 기능은 호출할 수 없다 - 오버라이딩이면 몰라도
    }
}
