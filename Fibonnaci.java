import java.util.*;
public class Fibonnaci{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<=nums;i++){
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
}