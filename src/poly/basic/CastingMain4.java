package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child)parent1;
        child1.childMethod();//문제 없음

        Parent parent2 = new Parent();
        Child child2 = (Child)parent2; //런타임 오류 - ClassCaseException
        //parent2는 Parent 인스턴스를 참조했기 때문에 자식 인스턴스는 존재하지 않음 - 따라서 다운캐스팅을 해도 childMethod()는 찾을 수 없음
        child2.childMethod();
    }
}
