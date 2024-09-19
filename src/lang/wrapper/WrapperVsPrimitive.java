package lang.wrapper;

public class WrapperVsPrimitive {

    public static void main(String[] args) {
        int iterations = 1_000_000_000; //반복 횟수 설정
        long startTime, endTime;

        //기본형 long 사용
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for(int i =0; i<iterations; i++){
            sumPrimitive += i;
        }//for end
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive=" + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간: " + (endTime-startTime) + "ms"); //731ms

        //래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i; //오토 박싱 발생
        }//for end
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간: " + (endTime-startTime) + "ms"); //7264ms
    }//main() end
}//class end
