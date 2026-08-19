<<<<<<< HEAD
import java.util.*;
class Reverse{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int num=sc.nextInt();
     int rev=0;
     while(num>0){
        int digit=num%10;
        rev=rev*10+digit;
        num=num/10;
     }   
     System.out.println(rev);
    }
}
=======
public class Reverse {
    public static void main(String[] args) {
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }
    }
}
>>>>>>> 3c5ed2fb5e65607b1509cea489a5c740d4a2f7df
