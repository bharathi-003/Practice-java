import java.util.*;
public class ReverseNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        int rev=0;
        while(nums!=0){
            int digit=nums%10;
            rev=rev*10+digit;
            nums=nums/10;
        }
        System.out.println(rev);
    }
}