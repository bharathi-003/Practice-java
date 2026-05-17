abstract class vehicle{
    abstract void start();
}
class car extends vehicle{
    void start(){
        System.out.println("Car starting");
    }
}
class Bike extends vehicle{
    void start(){
        System.out.println("Bike is starting");
    }
}



public class Demo {
    
}
