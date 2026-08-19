
import java.util.HashSet;
import java.util.Scanner;

public class Hashh{
    public static void main(String[] args) {
        HashSet <Integer> num=new HashSet<>();
        // num.add(1);
        // num.add(2);
        // num.add(2);
        // num.add(3);
        // num.add(4);
        // num.add(4);
        // num.add(5);
        // System.out.println(num);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            num.add(sc.nextInt());
        }
        for(int value:num){
            System.out.print(value+" ");
        }

    }
}