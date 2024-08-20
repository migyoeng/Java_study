package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가
    MemberConstruct(String name, int age){
        this(name, age, 50); //변경, 중복 코드 제거
        //자신의 생성자를 호출
        //생성자 코드의 첫줄에만 작성 가능
    }

    MemberConstruct(String name, int age, int grade){
        System.out.println("생성자 호출 name= " + name + ", age= " + age + ", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
