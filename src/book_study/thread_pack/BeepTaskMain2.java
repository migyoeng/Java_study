package book_study.thread_pack;

import java.awt.*;

public class BeepTaskMain2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++){
                    toolkit.beep();
                    try{
                        Thread.sleep(500);
                    } catch (Exception e){}//try end
                }//for end
            }//run() end
        }); //instance end

        thread.start();

        for(int i=0; i<5; i++){
            System.out.println("띵");
            try{
                Thread.sleep(500);
            } catch (Exception e){}
        }//for end

    }//main() end
}//class end
