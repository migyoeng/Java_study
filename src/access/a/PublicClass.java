package access.a;

//외부에서 접근 가능
public class PublicClass {
    public static void main(String[] args) {

        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

//접근 제어자 default로 같은 패키지 내에서만 접근 가능한 클래스
class DefaultClass1 {

}

class DefaultClass2 {

}
