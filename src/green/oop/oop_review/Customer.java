package green.oop.oop_review;

public class Customer {
    //field
    private int myMoney = 1000; //나의 재산
    private int myMileage = 0; //나의 마일리지

    private Product[] items = new Product[10];
    private int count = 0;//상품 구매 개수

    //constructor
    public Customer(){}//기본 생성자 default constructor

    //method
    public void buy(Product product){
        //Product -> 제품들의 부모 클래스
        if(myMoney < product.price){
            System.out.println("잔액이 부족합니다.");
            return;
        }//if end
        items[count++] = product;

        this.myMoney -= product.price;
        this.myMileage += product.bonusPoint;
    }//buy() end

    public void print(){
        //구매한 상품 목록 출력할 인스턴스
        StringBuilder shoplist = new StringBuilder();

        //총 지출 금액
        int total = 0;

        if(count == 0){
            System.out.println("구매한 상품이 없습니다.");
            return;
        }//if end

        for(int i=0; i<count; i++){
            shoplist.append(items[i].toString() + " ");//상품명 추가
            total += items[i].price;
        }//for end

        System.out.println("구매 상품 목록: " + shoplist);
        System.out.println("사용 금액: " + total);
        System.out.println("남은 재산: " + myMoney);
        System.out.println("나의 마일리지: " + myMileage);
    }

}//class end
