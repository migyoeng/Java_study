package book_study.list_pack;

import java.util.*;

public class LinkedListMain {
    public static void main(String[] args) {
        //List 컬렉션 중 LinkedList 예제와 ArrayList와의 비교
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new LinkedList<String>();

        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for(int i=0; i<10000; i++){
            list1.add(0,String.valueOf(i));
        }//for end
        endTime = System.nanoTime();
        System.out.println("ArrayList 소요시간: " + (endTime - startTime) + "ns"); //5426000ns

        startTime = System.nanoTime();
        for(int i=0; i<10000; i++){
            list2.add(0, String.valueOf(i));
        }//for end
        endTime = System.nanoTime();
        System.out.println("LinkedList 소요시간: " + (endTime-startTime) + "ns"); //1445000ns

        //끝에서부터 순차적으로 추가 및 제거하는 경우 ArrayList가 빠르지만
        //중간에 추가 및 제거하는 경우 LinkedList가 더 빠른 것을 확인할 수 있음
        //-> ArrayList는 뒤쪽 인덱스를 증감시키는데 시간이 더 소요된다

    }//main() end
}//class end
