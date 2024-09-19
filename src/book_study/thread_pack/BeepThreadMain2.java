package book_study.thread_pack;

import java.awt.*;

public class BeepThreadMain2 {
    public static void main(String[] args) {
        //Thread 익명 객체 구현
        Thread thread = new Thread(){
            @Override
            public void run(){
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                toolkit.beep();
                for(int i=0; i<5; i++) {
                        try {
                            Thread.sleep(500);
                        } catch (Exception e) {
                    }
                }//for end
            }//run() end
        };

        thread.start();

        for(int i=0; i<5; i++){
            System.out.println("띵");
            try{
                Thread.sleep(500);
            } catch (Exception e) {}
        }
    }//main() end
}//class end
