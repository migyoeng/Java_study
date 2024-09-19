package generic.test.ex3.unit;

public class BioUnit {
    //field
    private String name;
    private int hp;

    //constructor
    public BioUnit(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    //method
    public String getName(){
        return name;
    }

    public int getHp(){
        return hp;
    }

    @Override
    public String toString(){
        return "BioUnit{name = '" + name + '\'' + ", hp = " + hp + '}';
    }
}//class end
