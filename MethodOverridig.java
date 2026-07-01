class Bird{
    void fly(){
        System.out.println("Bird can fly");
    }
}
class Eagle extends Bird{
    @Override
    void fly(){
        System.out.println("Eagle files high");
    }
}
public class MethodOverridig{
    public static void main(String[] args) {
        Eagle e=new Eagle();
        e.fly();
    }
}