import java.util.*;
public class Marks {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Marks:");
    int marks=sc.nextInt();
    if(marks>90){
        System.out.println("Grade A");
    }
    else if(90>80){
        System.out.println("Grade B");
    }
    else if(80>70){
        System.out.println("Grade C");
    }
    else if(70>60){
        System.out.println("Grade D");
    }
    else if(60>50){
        System.out.println("Grade E");
    }
    else{
        System.out.println("fail");
    }
 }   
}
