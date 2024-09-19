package book_study.thread_pack;

public class User2 extends Thread{
    //field
    private Calculator calculator;

    //method
    public void setCalculator(Calculator calculator){
        this.setName("User2");
        this.calculator = calculator;
    }

    public void run(){
        calculator.setMemory(50);
    }
}//class end
