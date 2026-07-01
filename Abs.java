abstract class Vehile{
    abstract void Start();
}
class Car extends Vehile{
    void Start(){
        System.out.println("yamaha Engine");
    }
}
    public class Abs{
    public static void main(String[] args) {
        Car c=new Car();
        c.Start();
    }
}
