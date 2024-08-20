package access.ex;

public class ShoppingCart {
    //field
    private int max;
    private Item[] items;
    private int itemCount;

    //constructor
    public ShoppingCart(int max){
        this.max = max;
        items = new Item[max];
    }

    //method()
    public void addItem(Item item){
        if(itemCount >= max){
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }
        items[itemCount] = item;
        itemCount++;
    }//addItem() end

    public void displayItems(){
        System.out.println("장바구니 상품 출력");
        for(int i=0; i<itemCount; i++){
            System.out.println("상품명:" + items[i].getName() + ", 합계:" + items[i].getTotalPrice());
        }//for end
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }//displayItems() end

    private int calculateTotalPrice(){
        int totalPrice = 0;
        for(int i=0; i<itemCount; i++){
            totalPrice += items[i].getTotalPrice();
        }//for end
        return totalPrice;
    }
}//class end
