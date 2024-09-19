package book_study.api_class;

public class Member {
    //field
    public String id;

    //constructor
    public Member(String id){
        this.id = id;
    }//end

    //method
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){ //매개값이 Member타입인지 확인
            Member member = (Member) obj; //true일 경우 Member 타입으로 강제 변환
            if(id.equals(member.id)){ //필드의 id와 매개변수의 id가 일치하는지 확인
                return true;
            }//if end
        }//if end
        return false;
    }//equals() end

    //추가
    @Override
    public int hashCode(){
        return id.hashCode();
    }//hashCode() end

}//class end
