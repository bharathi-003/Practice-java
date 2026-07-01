abstract class Vehicle{
    void Start(){
        System.out.println("Vehicle Start");
    }
}
class Audi extends Vehicle{
    void Stop(){
        System.out.println("Vehile Stop");
    }
}
class Bens extends Vehicle{
    void Run(){
        System.out.println("Vehicle running");
    }
} 


public class AbsEx2 {
    public static void main(String[] args) {
        Audi a=new Audi();
        Bens b=new Bens();
        a.Start();
        b.Run();
        a.Stop();
        
        

    }
}