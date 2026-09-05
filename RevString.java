import java.util.Scanner;
public class RevString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        String reversed=new StringBuilder(n).reverse().toString();
        System.out.println(reversed);
        if(n.equals(reversed)){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
    }
}