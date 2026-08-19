import java.util.*;
public class InputMissExcep {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try{
            int num=s.nextInt();
        System.out.println(num);
        }
        catch(Exception e){
            System.out.println("There is no element to get length");
        }
        finally{
            System.out.println("java Programming");
        }
        System.out.println("High leve language");
    }
}
