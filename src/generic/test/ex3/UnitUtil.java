package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;

public class UnitUtil {

    //method
    public static <T extends BioUnit> T maxHp(T t1, T t2){
        if(t1.getHp() > t2.getHp()){
            return t1;
        } else {
            return t2;
        }
    }//maxHp() end

}//class end
