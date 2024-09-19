package book_study.api_class.ex;

public class FindNReplace {
    public static void main(String[] args) {
        String str = "모든 프로그램은 자바 언어로 개발될 수 있다";
        int index = str.indexOf("자바");
        if(index == -1){
            System.out.println("자바 문자열이 포함되어 있지 않음");
        } else {
            System.out.println("자바 문자열 포함ㅇㅇ");
            str = str.replace("자바", "Java");
        }//if end
        System.out.println("-->" + str);
    }//main() end
}//class end
