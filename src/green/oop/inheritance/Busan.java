package green.oop.inheritance;

public class Busan extends Korea {
    String name = "부산광역시";
    @Override
    void disp() {
        super.disp();
        System.out.println("Busan.disp() override");
        System.out.println("이 곳은 " + name);
    }
}
