package book_study.api_class;

public class ByteToStringMain {
    public static void main(String[] args) {
        //Hello Java 의 아스키코드 배열
        byte[] bytes = {72,101,108,108,111,32,74,97,118,97}; //byte형 배열

        //byte형 배열을 문자열형으로 변환하여 리턴
        String str1 = new String(bytes);
        System.out.println(str1); //Hello Java

        String str2 = new String(bytes, 6, 4); //String(byte[], start index 번호, 문자열 길이)
        System.out.println(str2); //Java
    }//main() end
}//class end
