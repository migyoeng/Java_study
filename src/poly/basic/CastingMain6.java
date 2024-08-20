package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
        //parent1은 인스턴스 내부에 Parent 인스턴스만 존재하기 때문에 call 내 if문 실행 불가

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
        //parent2는 인스턴스 내부 자신과 Child 인스턴스 모두 존재하기 때문에 다운캐스팅 후 childMethod() 호출 가능
    }//main() end

    private static void call(Parent parent){
        parent.parentMethod();
        if(parent instanceof Child child){
            System.out.println("Child 인스턴스 맞음");
            //Child child = (Child) parent;
            child.childMethod();
        }
    }
}// class end
