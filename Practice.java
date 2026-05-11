import java.util.Scanner;
public class Practice{
    public static void main(String[] args){


        

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=sc.next();
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        System.out.print("Enter your hometown:");
        String home=sc.next();
        System.out.print("Enter you price:");
        double price=sc.nextDouble();
        System.out.println("My name is:"+name);
        System.out.println("My age is:"+age);
        System.out.println("My hometown:"+home);
        System.out.println("The Price is:"+price);


       

    }
}
