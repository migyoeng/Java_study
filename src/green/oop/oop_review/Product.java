package green.oop.oop_review;

public class Product {
    //field
    public int price;//상품 가격
    public int bonusPoint;//마일리지

    //constructor
    public Product(){}
    public Product(int price){
        this.price = price;
        bonusPoint = (int)(price * 0.1);//마일리지 상품 가격의 10%
    }
}
