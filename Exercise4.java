class Bank{
    int balance;
    int deposit;
    int withdraw;
    int Finalblance;
    Bank() {
      balance=10000;
      deposit=15000;
      withdraw=12000;
      Finalblance=12000;
    }
    void display(){
        System.out.println("Initial Balance:"+balance);
        System.out.println("After deposit:"+deposit);
        System.out.println("After Withdrawal:"+withdraw);
        System.out.println("Final balance:"+Finalblance);
    }    
}
public  class Exercise4{
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.display();
    }
}