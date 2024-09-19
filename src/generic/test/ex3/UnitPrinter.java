package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

    //method
    public static <T extends BioUnit> void printV1(Shuttle<T> t){
        T unit = t.out(); //참조값 반환
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
        //unit.showInfo();
    }

    public static void printV2(Shuttle<?> t){
        BioUnit unit = t.out();
        System.out.println("이름: " + unit.getName() + ", HP: " + unit.getHp());
    }

}//class end
