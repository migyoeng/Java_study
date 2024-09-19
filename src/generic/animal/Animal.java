package generic.animal;

public class Animal {
    //field
    private String name;
    private int size;

    //constructor
    public Animal(String name, int size){
        this.name = name;
        this.size = size;
    }

    //method
    public String getName(){
        return name;
    }

    public int getSize(){
        return size;
    }

    public void sound(){
        System.out.println("동물 울음 소리");
    }

    @Override
    public String toString(){
        return "Animal {name= '" + name + '\'' + ", size= " + size + '}';
    }
}//class end
