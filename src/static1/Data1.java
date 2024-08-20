package static1;

public class Data1 {
    //field
    public String name;
    public int count; //인스턴스 변수 - 인스턴스가 하나씩 생성될 때마다 그 안에 count도 새롭게 생성됨

    //constructor
    public Data1(String name){
        this.name = name;
        count++;
    }

    //method
}//class end
