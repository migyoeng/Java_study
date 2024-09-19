package book_study.thread_pack;

public class ThreadB extends Thread {
    //constructor
    public ThreadB(){
        setName("ThreadB");
    }//end

    //method
    public void run(){
        System.out.println(getName() + "가 실행한 내용");
    }
}//class end
