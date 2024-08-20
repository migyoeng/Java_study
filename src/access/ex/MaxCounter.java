package access.ex;

public class MaxCounter {
    //field
    private int count;
    int max;

    //constructor
    public MaxCounter(int max){
        this.max = max;
        count = 0;
    }

    //method()
    public void increment(){
        if(count >= max){
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }//increment() end

    public int getCount(){
        return count;
    }
}
