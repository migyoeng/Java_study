package green.oop.inheritance;

public class Seoul extends Korea {
    String name = "서울특별시";
    @Override
    void disp() {
        super.disp();
        System.out.println("Seoul.disp() override");
        System.out.println("이 곳은 " + name);
    }
}
