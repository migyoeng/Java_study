package green.oop.interface1;

public interface Fightable extends Movable, Attackable{
    //인터페이스간 다중 상속 가능
    //부모 인터페이스에는 추상 메소드만 있기 때문
    //자식 클래스나 인터페이스에서 무조건 재정의 해야 실행 가능

    @Override
    void attack(Unit u);

    @Override
    void move(int x, int y);

    void fight(Unit u);
}
