package extends1.ex3;

//추가
public class HydrogenCar extends Car {
    //필드에 작성되어 있지 않지만 extends Car(상속)을 통해 move(), openDoor() 기능을 사용할 수 있다

    //method
    public void fillHydrogen(){
        System.out.println("수소를 충전합니다");
    }
}//class end
