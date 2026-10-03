import java.util.*;
public class PalindromeNum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums=sc.nextInt();
        int original=nums;
        int rev=0;
        while(nums!=0){
            int digit=nums%10;
            rev=rev*10+digit;
            nums=nums/10;
        }
        if(original==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }

    }
}