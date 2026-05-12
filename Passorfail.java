import java.util.Scanner;
public class Passorfail{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        if(a>=35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}