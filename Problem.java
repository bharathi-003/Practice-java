class Vehile{
    void Start(){
        System.out.println("Vehile is Starting");
    }
}
class Car extends Vehile{
    @Override
    void Start(){
        System.out.println("Car is starting");
    }
   
    void Start(String mode){
        System.out.println("Car Started in "+ mode +"mode");
    }
}
class Bike extends Vehile{
    @Override
    void Start(){
        System.out.println("Bike is starting");
    }
    
    void Start(String mode){
        System.out.println("Bike Started in "+mode+"mode");
    }
}
public class Problem{
    public static void main(String[] args) {
        Vehile v;
        v=new Car();
        v.Start();

        Car c=new Car();
        c.Start("Sports");

        v=new Bike();
        v.Start();

        Bike b=new Bike();
        b.Start("Eco");

    }
}