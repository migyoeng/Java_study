package extends1.ex1;

public class CarMain {

    public static void main(String[] args) {
        //전기차
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        //가솔린차
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();
    }//main() end
}//class end
