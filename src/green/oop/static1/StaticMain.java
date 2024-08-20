package green.oop.static1;

public class StaticMain {
    //static 키워드
    //인스턴스 변수나 메소드는 동적 메모리 영역(힙 메모리)에 생성되지만
    //static 키워드가 붙으면 정적 메모리 영역(method영영 - static영역)에 관리된다
    //인스턴스 소속이 아니기 때문에 인스턴스 생성 및 인스턴스를 통한 접근이 아닌
    //클래스에 직접 접근하여 호출할 수 있다
    public static void main(String[] args) {
        Sawon sawon1 = new Sawon("1201","정미경",1000);
        Sawon sawon2 = new Sawon("1202","정보경",700);
        Sawon sawon3 = new Sawon("1203","정유경",1500);
        Sawon sawon4 = new Sawon("1204","사원1",1100);
        Sawon sawon5 = new Sawon("1205","사원2",1200);

        Sawon[] members = {sawon1, sawon2, sawon3, sawon4, sawon5};

        for (Sawon member : members) {
            member.calcTax();
            member.totalPay();
            member.printInfo();
        }
    }

}
