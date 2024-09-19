package book_study.api_class;

public class Key {
    //field
    public int number;

    //constructor
    public Key(int number){
        this.number = number;
    }//end

    //method
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Key){
            Key compareKey = (Key) obj;
            if (this.number == ((Key) obj).number) {
                return true;
            }//if end
        }//if end
        return false;
    }//equals() end

    //추가
    @Override
    public int hashCode(){
        return number;
    }

}//class end
