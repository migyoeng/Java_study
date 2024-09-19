package book_study.api_class;

public class CarMain {
    public static void main(String[] args) throws Exception {
        //첫번째 방법 Class class1 = 클래스명.class
        Class class1 = Car.class;

        //두번째 방법 Class class1 = Class.forName("패키지명...클래스명");
        Class class2 = Class.forName("book_study.api_class.Car");

        //세번째 방법
        //Car car = new Car();
        //Class class1 = car.getClass();
        Car car = new Car();
        Class class3 = car.getClass();

        System.out.println(class1.getName());
        System.out.println(class2.getSimpleName());
        System.out.println(class3.getPackage().getName());
    }
}//class end
