package generic.ex3;

public class AnimalHospitalV2<T> {
    //field
    private T animal;

    //method
    public void set(T animal){
        this.animal = animal;
    }

    public void checkUp(){
        //Object의 기능만 사용 가능
        animal.toString();
        animal.equals(null);

        //컴파일 오류
        //메소드 정의 시점에 타입 매개변수 T의 타입을 알 수 없다.
        //때문에 Animal 클래스의 필드와 메소드를 호출할 수 없음
        //System.out.println("동물 이름: " + animal.getName);
        //animal.sound();
    }

    public T getBigger(T target){
        //마찬가지로 T의 타입을 알 수 없기 때문에 Object의 기능만 사용 가능
        //return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }

}//class end
