package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter){
        nameField = nameParameter; //this 생략, 필드와 매개변수 명이 다르기 때문
    }
}
