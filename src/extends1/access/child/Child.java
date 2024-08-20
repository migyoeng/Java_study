package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call(){
        publicValue = 1;    //부모 클래스의 publicValue 접근 가능
        protectedValue = 1; //다른 패키지이지만 상속관계이므로 접근 가능
        //defaultValue = 1; //다른 패키지 접근 불가
        //privateValue = 1; //접근 불가

        publicMethod();
        protectedMethod();
        //defaultMethod();    //다른 패키지 접근 불가
        //privateMethod();    //접근 불가

        printParent();
    }
}
