package book_study.thread_pack;

public class BeepTaskMain {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start(); //Thread 클래스의 start() 메소드는 매개변수로 받은 beepTask의 run() 메소드를 불러와 실행한다

        for(int i=0; i<5; i++){
            System.out.println("띵");
            try{
                Thread.sleep(500);
            } catch (Exception e){}//try end
        }//for end
    }//main() end
}//class end
