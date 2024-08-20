package access.ex;

public class Item {
    //field
    private String name;
    private int price;
    private int quantity;

    //constructor
    public Item(String name, int price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    //method()
    public String getName(){
        return name;
    }//getName() end

    public int getTotalPrice(){
        return price*quantity;
    }
}//class end
