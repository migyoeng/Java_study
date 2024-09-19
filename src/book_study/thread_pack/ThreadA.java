package book_study.thread_pack;

public class ThreadA extends Thread {
    //constructor
    public ThreadA(){
        setName("ThreadA");
    }

    //method
    public void run(){
        System.out.println(getName() + "가 출력한 내용");
    }//run() end
}//class end
