package book_study.thread_pack;

public class User1 extends Thread {
    //field
    private Calculator calculator;

    //method
    public void setCalculator(Calculator calculator){
        this.setName("User1");
        this.calculator = calculator;
    }

    public void run(){
        calculator.setMemory(100);
    }
}//class end
