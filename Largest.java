import java.util.Scanner;
public class Largest{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>b && c<a){
        System.out.println("Max value:"+a);
    }
    else if(b>a && c<b){
        System.out.print("Max value:"+b);
    }
    else{
        System.out.print("Max value:"+c);
    }
    }
}