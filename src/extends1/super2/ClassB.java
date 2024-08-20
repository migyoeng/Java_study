package extends1.super2;

public class ClassB extends ClassA{

    //생성자
    public ClassB(int a){
        this(a,10); //기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a= " + a);
    }

    public ClassB(int a, int b){
        super(); //부모의 기본 생성자 생략 가능
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}
