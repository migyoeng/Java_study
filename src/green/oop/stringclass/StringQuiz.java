package green.oop.stringclass;

import java.util.StringTokenizer;

public class StringQuiz {

    public static void main(String[] args) {
        String str1 = "Gone With The Wind";

        System.out.println(str1.length());//18
        System.out.println(str1.toLowerCase());//gone with the wind
        System.out.println(str1.toUpperCase());//GONE WITH THE WIND
        System.out.println(str1.concat(" exciting"));//Gone With The Wind exciting

        System.out.println(str1.charAt(6));//i

        String[] words = str1.split(" ");
        for (String word : words) {
            System.out.println(word);
        }//공백을 기준으로 분리한 문자열 순차 출력

    //문제1) 이메일 분리 - 아이디 / 도메인
        String email = "wjdalrud@gmail.com";

        //substring 활용
        int indexNum = email.indexOf("@");
        System.out.println(email.substring(0, indexNum));
        System.out.println(email.substring(indexNum+1));

        //split 활용
        String[] mails = email.split("@");
        for (String mail : mails) {
            System.out.println(mail);
        }

        //StringTokenizer 활용
        StringTokenizer token = new StringTokenizer(email,"@");
        while(token.hasMoreElements()){
            String mail = token.nextToken();
            System.out.println(mail);
        }
        System.out.println("--------------------");

    //문제2) 이미지 파일 첨부
        /*
        출력 결과
        파일명: sky24.08.09
        확장명: jpg / png / gif
        */
        String imagePath = "e:/frontend/images/sky24.08.09.png";

        //1) 이미지 파일 이름 추출
        int lastSlash = imagePath.lastIndexOf("/");//마지막 / 인덱스 번호
        String imageUrl = imagePath.substring(lastSlash + 1);
        System.out.println("이미지 파일 명: " + imageUrl);

        //2) 이미지 이름과 확장자 명 분리
        int lastDot = imageUrl.lastIndexOf(".");//마지막 . 인덱스 번호
        String imageName = imageUrl.substring(0, lastDot);
        String imageExt = imageUrl.substring(lastDot + 1);
        System.out.println("파일명: " + imageName);
        System.out.println("파일명: " + imageExt);

        imageExt = imageExt.toLowerCase();
        if(imageExt.equals("jpg") || imageExt.equals("png") || imageExt.equals("gif")){
            System.out.println("이미지 파일입니다. \n 파일 전송이 완료되었습니다.");
        } else {
            System.out.println("이미지 파일이 아닙니다. 다시 한번 확인해주세요.");
        }

        //substring 주의 사항
        //해당 문자열을 변경하여 재대입하는게 아닌 새로운 문자열로 반환되기 때문에
        //메모리 사용량이 증가할 수 있음!

    }//main() end
}//class end
