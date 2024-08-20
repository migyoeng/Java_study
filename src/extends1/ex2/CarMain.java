package extends1.ex2;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move(); //자식 클래스에는 작성되어있지 않지만 Car클래스를 상속받음으로 인해 Car클래스의 move() 메소드를 사용할 수 있다
        electricCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

    }//main() end
}//class end
