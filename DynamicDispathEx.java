class Payment{
    void Pay(){
        System.out.println("Company");
    }
}
class Creditcard extends Payment{
    @Override
    void Pay(){
        System.out.println("Payment through credit Card");
    }
}
class Upi extends Payment{
    @Override
    void Pay(){
        System.out.println("Payment through Upi");
    }
}
public  class DynamicDispathEx{
    public static void main(String[] args) {
        Payment a;
        Creditcard c=new Creditcard();
        c.Pay();
        Upi u=new Upi();
        u.Pay();
    }
}