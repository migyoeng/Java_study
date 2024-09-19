package book_study.thread_pack;

import java.awt.*;

public class BeepPrintMain {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit(); //Toolkit 객체 얻기
        for(int i=0; i<5; i++){
            toolkit.beep(); //비프음 발생
            try {
                Thread.sleep(500); //0.5초간 일시정지
            } catch (Exception e){

            }//try end
        }//for end

        for(int i=0; i<5; i++){
            System.out.println("띵");
            try{
                Thread.sleep(500);
            } catch (Exception e){

            }
        }
    }//main() end
}//class end
