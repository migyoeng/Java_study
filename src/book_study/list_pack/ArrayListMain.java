package book_study.list_pack;

import java.util.*;

public class ArrayListMain {
    public static void main(String[] args) {
        //List 컬렉션 중 ArrayList
        List<String> list = new ArrayList<String>();

        list.add("Java"); //list객체에 "Java" 저장
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBATIS");

        int size = list.size(); //저장된 요소 개수, list의 size
        System.out.println("총 객체 수: " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2: " + skill);
        System.out.println();

        for(int i=0; i<list.size(); i++){
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }//for end
        System.out.println();

        list.remove(2); //2번 인덱스 객체 Database 삭제
        list.remove(2); //2번 인덱스 객체 Servlet/JSP
        list.remove("iBATIS");

        for(int i=0; i<list.size(); i++){
            String str = list.get(i);
            System.out.println(i + ":" + str);
        }//for end
    }
}//class end
