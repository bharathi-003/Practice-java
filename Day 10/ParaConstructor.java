class Car{
    String name;
    float price;
    Car(String n,float a) {
       name=n;
       price=a;
    }
    void display(){
        System.out.println(name+" "+price);
    }
}
public class ParaConstructor{
    public static void main(String[] args) {
        Car c1=new Car("Audi",200000);
        Car c2=new Car("BMW",3500000);
        c1.display();
        c2.display();
    }
}