
import java.util.Scanner;

public class ParaAndArgue{
    static void display(String username) {
        System.out.println("Hello"+" "+username);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        display(name);
    }
}