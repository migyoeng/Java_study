package generic.ex5;

public class Box<T> {
    //field
    private T value;

    //method
    public void set(T value){
        this.value = value;
    }

    public T get(){
        return value;
    }
}//class end
