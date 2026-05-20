import java.util.*;
class Addition{
    void add(int a,int b){
        System.out.println("Add="+(a+b));
    }
}
class Subtraction extends Addition{
    void sub(int a,int b){
        System.out.println("Subtraction="+(a-b));
    }
}
class Multiplication extends Addition{
    void multi(int a,int b){
        System.out.println("Multiplication="+(a*b));
    }
}

public class Hierarchical{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Subtraction st=new Subtraction();
        st.sub(a, b);
        st.add(a, b);
        Multiplication m=new Multiplication();
        m.add(a, b);
        m.multi(a, b);
    }
}