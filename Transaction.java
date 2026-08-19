import java.util.*;
public class Transaction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enetr the balance:");
        int a=sc.nextInt();
        System.out.print("Enter the Withdraw:");
        int b=sc.nextInt();
        if(a>=b){
            System.out.println("Transaction succesful");
        }
        else{
            System.out.println("Transaction failed");
        }
        System.out.println("Current balance:"+(a-b));
    }
}
