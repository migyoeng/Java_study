package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count=" + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count=" + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count=" + Data3.count);

        //추가
        //인스턴스를 통한 접근
        Data3 data4 = new Data3("D");
        System.out.println(data4.count);    //인스턴스를 통해 클래스 변수에 접근해도 실행은 됨. 하지만 인스턴스 변수를 통해 접근 시 클래스 변수인지 인스턴스 변수인지 구별하기 어려움

        //클래스를 통한 접근
        System.out.println(Data3.count);
    }//main() end
}//class end
