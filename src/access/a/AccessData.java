package access.a;

public class AccessData {

    //field
    public int publicField;
    int defaultField;
    private int privateField;

    //method
    public void publicMethod(){
        System.out.println("publicMethod 호출" + publicField);
    }//publicMethod() end

    void defaultMethod(){
        System.out.println("dafaultMethod 호출" + defaultField);
    }//defaultMethod() end

    private void privateMethod(){
        System.out.println("privateMethod 호출" + privateField);
    }//privateMethod() end

    public void innerAccess(){
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;

        publicMethod();
        defaultMethod();
        privateMethod();
    }
}
