package generic.test.ex1;

public class Container<T> {
    //field
    private T item;

    //method
    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }

    public boolean isEmpty() {
        return item == null;
        /*
        if (item == null) {
            return true;
        } else {
            return false;
        }
*/

    }
}//class end
