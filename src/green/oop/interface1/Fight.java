package green.oop.interface1;

public class Fight extends Unit implements Fightable {
    @Override
    public void attack(Unit u) {
        System.out.println(x + "가 " + y + "를 공격합니다.");
    }

    @Override
    public void move(int x, int y) {
        System.out.println(x + "와 " + y + "가 이동합니다.");
    }

    @Override
    public void fight(Unit u) {
        System.out.println(x + "와 " + y + "가 싸웁니다.");
        if(x < y){
            System.out.println(x + "가 공격당했습니다.");
            x -= 5;
        } else {
            System.out.println(y + "가 공격당했습니다.");
            y -= 5;
        }
    }
}
