class Bank {
    private String name;
    private double balance;
    public void setName(String n){
        name=n;
    }
    public void deposit(double d){
        if(d>0){
            balance += d;
        }
        else{
            System.out.println("error...");
        }
    }
    public void withdrawal(double d){
        if(d<=balance){
            balance=d;
        }
        else{
            System.out.println("Insufficiant balance");
        }
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    }
    public class ExampleEncap{
        public static void main(String[] args) {
             Bank b1=new Bank();
        b1.setName("Bharathi");
        b1.deposit(100.15);
        b1.withdrawal(200);

        System.out.println(b1.getName());
        System.out.println(b1.getBalance());
        }
    }