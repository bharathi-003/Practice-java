import java.util.*;
class Computer{
    void add(int a,int b){
        System.out.println(a+b*100);
    }
}
class Tech extends Computer{
    void add(int a,int b){
        System.out.println((a+b)*a);
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Tech t=new Tech();
        t.add(a, b);
    }
}
