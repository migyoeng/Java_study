package access;

public class Speaker {
    //field
    private int volume; //private으로 해당 클래스 내에서만 접근 가능

    //constructor
    Speaker(int volume){
        this.volume = volume;
    }

    //method
    void volumeUp(){
        if(volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다");
        } else{
            volume += 10;
            System.out.println("음량을 10 증가합니다");
        }
    }//volumeUp() end

    void volumeDown(){
        volume -= 10;
        System.out.println("volumeDown 호출");
    }//volumeDown() end

    void showVolume(){
        System.out.println("현재 음량: " + volume);
    }
}
