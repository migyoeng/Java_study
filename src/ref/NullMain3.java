package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count=" + bigData.count);
        System.out.println("bigData.data=" + bigData.data);

        //NullPointerException
        System.out.println("bigData.data.value=" + bigData.data.value);
        //data는 참조값을 가지지 않은 null 상태이므로 value에 접근 불가
    }
}
