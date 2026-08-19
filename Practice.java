  class Bank1{
    String Account_holdername;
    int AccountNo;
    double balance;

void display(){
    System.out.println(Account_holdername);
    System.out.println(AccountNo);
    System.out.println(balance);
}
}
public class Practice{
    public static void main(String[] args) {
        Bank1 a1=new Bank1();
        a1.Account_holdername="Rio";
        a1.AccountNo=12345;
        a1.balance=46.000000;
        a1.display();

    }
}
