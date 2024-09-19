package book_study.api_class;

public class ExitMain {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println(i);
            if(i == 5){
                //System.exit(0);
                break; //프로세스 종료가 아닌 for문만 종료하려면 break;문 사용
            }
        }//for end
        System.out.println("마무리 코드"); //System.exit(0)으로 인해 실행되지 않음

        long time1 = System.currentTimeMillis();
        long time2 = System.nanoTime();

        System.out.println(time1);
        System.out.println(time2);
    }//main() end
}//class end
