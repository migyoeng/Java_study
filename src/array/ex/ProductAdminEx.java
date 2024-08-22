package array.ex;

import java.util.Scanner;

public class ProductAdminEx {

    //지금까지 배웠던걸로 리팩토링 해보기

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productName = new String[10];
        int[] productPrice = new int[10];
        int productCount = 0;

        while(true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요: ");
            int choice = sc.nextInt();
            sc.nextLine();

            //상품 등록 시작
            if (choice == 1) {
                if (productCount >= 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                }//if end

                System.out.print("상품 이름을 입력하세요: ");
                productName[productCount] = sc.nextLine();
                System.out.print("상품 가격을 입력하세요: ");
                productPrice[productCount] = sc.nextInt();
                productCount++;
            }//상품 등록 끝

            //상품 목록 출력 시작
            else if(choice == 2){
                if(productCount == 0){
                    System.out.println("등록된 상품이 없습니다");
                }
                for(int i=0; i<productCount; i++){
                    System.out.println(productName[i] + ":" + productPrice[i] + "원");
                }//for end
            }//상품 목록 출력 끝

            //시스템 종료
            else if(choice == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }//시스템 종료 끝
        }//while end

    }//main() end
}//class end
