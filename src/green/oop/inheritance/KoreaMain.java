package green.oop.inheritance;

public class KoreaMain {

    public static void main(String[] args) {
        Korea korea = new Korea();
        korea.view();
        korea.disp();

        Seoul seoul = new Seoul();
        seoul.view();
        seoul.disp();

        Busan busan = new Busan();
        busan.view();
        busan.disp();
    }
}
