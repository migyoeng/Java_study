package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        data = new Data();
        System.out.println("2. data = " + data);
        data = null;
        System.out.println("3. data = " + data);
        data = new Data();
        System.out.println("4. data = " + data); //처음에 반환된 참조값과 다른것을 확인할 수 있음
        
        //data에 다시 null을 입력하면서 참조하고 있던 인스턴스는 더이상 참조되지 못하고 메모리에 상주하게 된다
        //아무도 참조하지 않게 되면 참조값을 다시 구할 방법이 없다
        //더 이상 참조할 수 없는 객체는 GC(Garbage Collection)이 제거해줌
    }
}
