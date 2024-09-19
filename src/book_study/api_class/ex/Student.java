package book_study.api_class.ex;

public class Student {
    //field
    private String studentName;

    //constructor
    public Student(String studentName){
        this.studentName = studentName;
    }//end

    //method
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student student = (Student) obj;
            if(studentName.equals(((Student) obj).studentName)){
                return true;
            }//if end
        }//if end
        return false;
    }//equals() end

    @Override
    public int hashCode(){
        return studentName.hashCode();
    }
}//class end
