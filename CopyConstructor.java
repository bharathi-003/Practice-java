class Car{
    String name;
    float price;
    Car(String n,float a) {
       name=n;
       price=a;
    }

    Car(Car c) {
        name=c.name;
        price=c.price;
    }
    
    void display(){
        System.out.println(name+" "+price);
    }
}
public class CopyConstructor{
    public static void main(String[] args) {
        Car c1=new Car("Rollsrouce",2300000);
        Car c2=new Car(c1);
        c2.display();
    }
}