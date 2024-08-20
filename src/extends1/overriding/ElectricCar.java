package extends1.overriding;

public class ElectricCar extends Car {

    //method
    @Override //프로그램이 읽을 수 있는 특별한 주석
    public void move(){
        System.out.println("전기차를 빠르게 이동합니다");
    }

    public void charge(){
        System.out.println("차를 충전합니다");
    }//charge() end
}//class end
