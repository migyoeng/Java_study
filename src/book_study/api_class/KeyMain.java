package book_study.api_class;

import java.util.HashMap;

public class KeyMain {
    public static void main(String[] args) {
        //Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        //식별키 new Key(1)로 "홍길동"을 저장
        hashMap.put(new Key(1), "홍길동");

        //식별키 new Key(1)로 "홍길동"을 읽어옴
        String value = hashMap.get(new Key(1));
        System.out.println(value); //hashCode() overriding 전 : null, hashCode() overriding 후 : "홍길동"
    }//main() end
}//class end
