package lang.wrapper;

public class MyInteger {
    //field
    private final int value;

    //constructor
    public MyInteger(int value){
        this.value = value; //생성자를 이용해 상수 value 초기화
    }

    //method

    //getter
    public int getValue() {
        return value;
    }

    public int compareTo(int target){
        if(value < target){
            return -1;
        } else if(value == target){
            return 0;
        } else{
            return 1;
        }
    }//compareTo() end

    @Override
    public String toString(){
        return String.valueOf(value); //숫자를 문자로 변경하여 반환
    }
}//class end
