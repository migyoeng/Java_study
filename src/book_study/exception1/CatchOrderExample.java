package book_study.exception1;

public class CatchOrderExample {
    public static void main(String[] args) {

        //catch블록의 순서 중요
        //하위 예외 클래스 먼저, 상위 예외 클래스가 아래쪽으로 위치되게 작성
        try {
            String data1 = args[0];
            String data2 = args[1];
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);
            int result = value1 + value2;
            System.out.println(data1 + "+" + data2 + "=" + result);
        } catch(ArrayIndexOutOfBoundsException e){  //자식(하위) 예외 클래스
            System.out.println("실행 매개값의 수가 부족합니다.");
        } catch(Exception e){   //부모(상위) 예외 클래스
            System.out.println("실행에 문제가 있습니다.");
        } finally {
            System.out.println("다시 실행하세요.");
        }
    }//main() end
}//class end
