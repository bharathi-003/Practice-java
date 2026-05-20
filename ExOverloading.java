import java.util.*;
class numbers{
    void num(int n){
        for(int i=1;i<n;i++){
            System.out.print(i+" ");
        }
    }
    void num(int start,int end){
        for(int i=start;i<end;i++){
            System.out.println(i);
        }
    }
}

public class ExOverloading{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        numbers m=new numbers();
        m.num(n);
        int Strat=sc.nextInt();
        int end=sc.nextInt();
        
    }
}