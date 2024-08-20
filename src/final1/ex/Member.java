package final1.ex;

public class Member {
    //field
    private final String id; //final 키워드 사용, 초기값 지정 후 수정 불가
    private String name;

    //constructor
    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }

    //method
    public void changeData(String id, String name){
        //this.id = id; //compile error, 생성자를 통해 초기화된 final id는 더이상 어떤 방법으로도 수정 불가능
        this.name = name;
    }

    public void print(){
        System.out.println("id: " + id + ", name: " + name);
    }

}//class end
