package extends1.super1;

public class Child extends Parent {

    //field
    public String value = "child";

    //method
    @Override
    public void hello(){
        System.out.println("Child.hello");
    }

    public void call(){
        System.out.println("this value = " + this.value);
        System.out.println("super value = " + super.value);

        this.hello();
        super.hello();
    }
}
