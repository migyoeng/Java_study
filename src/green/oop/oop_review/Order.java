package green.oop.oop_review;

import java.util.Vector;

public class Order {
    //field
    private int myMoney = 1000; //나의 재산
    private int myMileage = 0; //나의 마일리지

    private Vector<Product> items = new Vector<>();
    private int count = 0;//상품 구매 개수

    //constructor
    public Order(){}//기본 생성자 default constructor

    //method
    public void buy(Product product){
        //Product -> 제품들의 부모 클래스
        if(myMoney < product.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }//if end
        items.add(product);

        this.myMoney -= product.price;
        this.myMileage += product.bonusPoint;
    }//buy() end

    //반품 메소드 추가
    public void refund(Product product){
        if(items.remove(product)){
            System.out.println(product.toString() + "이 반품되었습니다.");
            myMoney += product.price;
            myMileage -= product.bonusPoint;
        } else {
            System.out.println("구매한 상품이 없습니다.");
        }//if end
    }//refund() end

    public void print(){
        //구매한 상품 목록 출력할 인스턴스
        StringBuilder shoplist = new StringBuilder();

        //총 지출 금액
        int total = 0;

        if(items.size() == 0){
            System.out.println("구매한 상품이 없습니다.");
            return;
        }

        for(int i=0; i<items.size(); i++){
            Product p = items.get(i);
            shoplist.append(p).append(" ");
            total += p.price;
        }

        System.out.println("구매한 상품 목록: " + shoplist);
        System.out.println("총 지출 금액: " + total);
        System.out.println("남은 금액: " + myMoney);
        System.out.println("나의 마일리지: " + myMileage);
    }

}//class end
