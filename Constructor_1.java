class Mobile{
    String name;
    int price;

    //default constructor
    Mobile(){
            name="Samsung";
            price=130000;
    }
    //method
    void display(){
        System.out.println(name+" "+price);
    }
}


public class Constructor_1 {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        m.display();
    }
}
