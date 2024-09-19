package book_study.api_class.ex;

public class Member {
    //field
    private String id;
    private String name;

    //constructor
    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }//end

    //method
    @Override
    public String toString(){
        return id + ": " + name;
    }
}//class end
