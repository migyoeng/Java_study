package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils(){
        //private 접근 제어로 외부 클래스에서 생성자를 만들지 못하게 막음
    }

    //배열 요소의 합 구하기
    public static int sum(int[] array){
        int total = 0;
        for(int i=0; i<array.length; i++){
            total += array[i];
        }
        return total;
    }//sum() end

    //배열 요소의 평균 구하기
    public static double average(int[] array){
        return (double)sum(array)/array.length;
    }//average() end

    //배열 요소의 최소값 구하기
    public static int min(int[] array){
        int min = array[0];
        for(int i=0; i<array.length; i++){
            if(min > array[i]){
                min = array[i];
            }//if end
        }//for end
        return min;
    }//min() end

    //배열 요소의 최대값 구하기
    public static int max(int[] array){
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
            }//if end
        }//for end
        return max;
    }//max() end

}//class end
