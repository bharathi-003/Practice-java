import java.util.*;
class  Employee{
    private int marks;//varaibles
    public void set(int marks){
        this.marks=marks;
    }
    public int get(){
        return marks;
    }
}

public class Encap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        Employee e=new Employee();
        e.set(marks);
        System.out.println(e.get());
    }
}
