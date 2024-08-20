package green.oop.static1;

class Sawon {
    //멤버 변수 field
    String memberNum;//사원번호
    String name;    //이름
    int pay;        //급여
    static String company = "(주)그린컴";
    static int sudang = 10;
    static double tax = 0.03;

    //생성자 constructor
    public Sawon() {}//기본 생성자 default constructor
    public Sawon(String memberNum, String name, int pay){
        this.memberNum = memberNum;
        this.name = name;
        this.pay = pay;
    }//end

    //멤버 함수 method

    public double calcTax(){
        double myTax = this.pay * tax;
        return myTax;
    }

    public int  totalPay(){
        int total = (int) (this.pay - calcTax() + sudang);
        return total;
    }

    public void printInfo(){
        System.out.println("회사 이름: " + company);
        System.out.println("사원 번호: " + memberNum);
        System.out.println("이름: " + name);
        System.out.println("급여: " + pay);
        System.out.println("수당: " + sudang);
        System.out.println("세금: " + calcTax());
        System.out.println("총 지급액: " + totalPay());
    }

}//class end
