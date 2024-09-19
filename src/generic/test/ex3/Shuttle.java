package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class Shuttle<T extends BioUnit> {
    //field
    private T unit;

    //method
    public T out(){
        return unit;
    }

    public void in(T t){
        unit = t;
    }

    public void showInfo(){
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }
    /*
    //field
    private String name;
    private int hp;

    //method
    public void in(T t){
        name = t.getName();
        hp = t.getHp();
    }

    public void showInfo(){
        System.out.println("이름: " + name + ", HP: " + hp);
    }*/
}//class end
