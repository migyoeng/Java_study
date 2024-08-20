package cond.ex;

import java.util.Scanner;

public class MoveRateEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("평점 입력: ");
        double rating = sc.nextDouble();

        if(rating <= 9){
            System.out.println("'어바웃타임'을 추천합니다.");
        }//if end

        if(rating <= 8){
            System.out.println("'토이 스토리'를 추천합니다.");
        }//if end

        if(rating <= 7){
            System.out.println("'고질라'를 추천합니다.");
        }//if end
    }//main() end
}//class end
