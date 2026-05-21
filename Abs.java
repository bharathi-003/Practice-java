import java.util.*;
abstract class picture{
    abstract void area(int side);
    void fun(){
        System.out.println("Java program");
    }
}
class square extends picture{
    void area(int side){
        System.out.println(side*side);
    }

}
public class Abs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int side =sc.nextInt();
        square s=new square();
        s.area(side);
        s.fun(); 
    }
}
