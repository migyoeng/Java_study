package generic.test.ex2;

public class Pair<T1, T2> {
    //field
    private T1 first;
    private T2 second;

    //emthod
    public T1 getFirst(){
        return first;
    }

    public T2 getSecond(){
        return second;
    }

    public void setFirst(T1 first){
        this.first = first;
    }

    public void setSecond(T2 second){
        this.second = second;
    }

    @Override
    public String toString(){
        return "Pair{first = " + first + ", second = " + second + '}';
    }
}//class end
