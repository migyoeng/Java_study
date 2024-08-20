package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data(); //Data클래스에 접근할 수 있는 참조값 반환
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);
        System.out.println("bigData.data.value=" + bigData.data.value);
    }
}
