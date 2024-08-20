package static1;

public class Data2 {
    //field
    public String name;

    //constructor
    public Data2(String name, Counter counter){
        this.name = name;
        counter.count++;
    }
}
