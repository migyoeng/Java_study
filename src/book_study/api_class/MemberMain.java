package book_study.api_class;

public class MemberMain {
    public static void main(String[] args) {
        Member member1 = new Member("blue");
        Member member2 = new Member("blue");
        Member member3 = new Member("red");

        if(member1.equals(member2)){ //매개값이 Member 타입이고 id 필드값도 동일하다면
            System.out.println("member1과 member2는 일치합니다.");
        } else {
            System.out.println("member1과 member2는 일치하지 않습니다.");
        }//if end

        if(member1.equals(member3)){ //매개값이 Member 타입이고 id 필드값이 동일하면
            System.out.println("member1과 member3은 일치합니다.");
        } else {
            System.out.println("member1과 member3은 일치하지 않습니다");
        }

    }//main() end

}//class end
