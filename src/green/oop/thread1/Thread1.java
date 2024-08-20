package green.oop.thread1;

class MyThread1 {
    //field
    private int num;
    private String name;

    //constructor
    public MyThread1(){} //기본 생성자 default constructor
    public MyThread1(int num, String name){
        this.num = num;
        this.name = name;
    }//end

    //method
    //private run() 메소드를 간접 호출하는 메소드
    public void start(){
        run();
    }//start() end

    private void run(){
        for(int i=0; i<num; i++){
            System.out.println(name + ":" + i);
        }//for end
    }//run() end

}//class end

public class Thread1 {

    public static void main(String[] args) {
        //자바에는 Thread 클래스가 있다
        //-> 하나의 프로그램이나 하나의 메소드가 CPU 자원을 독점하는 것을 막을 수 있다
        //-> 채팅 서비스

        //1) 스레드를 사용하지 않은 경우
        //코드를 작성한 순서대로 실행되는 것을 알 수 있다
        //즉, t1~t3.start() 메서드가 동시에 실행되는 것이 아니라
        //하나의 메소드 실행이 끝나면 다음 메소드를 실행하는 경우
        MyThread1 t1 = new MyThread1(20, "*");
        MyThread1 t2 = new MyThread1(20, "**");
        MyThread1 t3 = new MyThread1(20, "***");

        t1.start();
        t2.start();
        t3.start();

    }//main() end
}//class end
