import java.util.*;
public class Excep {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
        int num1=s.nextInt();
        int num2=s.nextInt();
        System.out.println(num1/num2);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot Divide by Zero");
        }
    }
}
