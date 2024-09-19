package book_study.thread_pack;

public class Calculator {
    //field
    private int memory;

    //method
    public int getMemory(){
        return memory;
    }

    public synchronized void setMemory(int memory){ // 동기화 메소드(임계 영역)
        this.memory = memory;
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e){}
        System.out.println(Thread.currentThread().getName() + ":" + this.memory);
    }
}//class end
