package static1;

public class Data3 {
    //field
    public String name; //인스턴스 변수 - 인스턴스 소속, 인스턴스를 생성해야 사용 가능, 인스턴스를 만들 때마다 새롭게 생성
    public static int count; //static 변수 / 클래스 변수 - 클래스 소속, 인스턴스와 무관, 클래스에 바로 접근하여 사용, 프로그램 실행 시 단 1개만 존재, 여러 곳에서 공유하는 목적

    //constructor
    public Data3(String name){
        this.name = name;
        count++;
    }
}
