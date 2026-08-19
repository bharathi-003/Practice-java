
import java.util.ArrayList;
import java.util.Scanner;

public class Even{
    public static void main(String[] args) {
        ArrayList <Integer> num=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        for(int value:num){
            if(value%2==0){
                System.out.print(value+" ");
            }
        }
        
    }
}