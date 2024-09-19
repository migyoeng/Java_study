package book_study.api_class;

public class SmartPhone {
    //field
    private String company;
    private String os;

    //constructor
    public SmartPhone(String company, String os){
        this.company = company;
        this.os = os;
    }//end

    //method
    //toString() 재정의
    @Override
    public String toString(){
        return company + ", " + os;
    }//toString() end
}//class end
