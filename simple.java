import java.util.*;
public class simple {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zero=0;
        for(int i=1;i<=5;i++){
            int value=sc.nextInt();
            if(value>0){
                positive++;
            }
            else if(value<0){
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println("positive values:"+positive);
        System.out.println("negative valuse:"+negative);
        System.out.println("Zero valuse:"+zero);
    }
}
