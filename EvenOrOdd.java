import java.util.*;
public class EvenOrOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int even=0;
        int odd=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even:"+even);
        System.out.println("Odd:"+odd);

    }
}