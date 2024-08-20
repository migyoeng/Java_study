package cond.ex;

import java.util.Scanner;

public class DistanceEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("거리 입력: ");
        int distance = sc.nextInt();

        String transport;
        if(distance <= 1){
            transport = "도보";
        } else if(distance <= 10){
            transport = "자전거";
        } else if(distance <= 100){
            transport = "자동차";
        } else{
            transport = "비행기";
        }//if end

        System.out.println(transport + "를 이용하세요");
    }//main() end
}//class end
