import java.util.*;
public class Count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        int count=0;
        while(nums!=0){
            count++;
            nums=nums/10;
        }
        System.out.println(count);
    }
}