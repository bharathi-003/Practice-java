class Program{
    int Multiply(int a,int b){
        return a*b;
    }
    int Multiply(int a,int b,int c){
        return a*b*c;
    }
    double Multiply(double a,double b){
        return a*b;
    }
    String Multiply(String a,String b){
        return a+b;
    }
}
public class MethodOverloadingEX{
    public static void main(String[] args) {
        Program p=new  Program();
        System.out.println(p.Multiply(3, 5));
       System.out.println( p.Multiply(3, 4, 5));
       System.out.println(p.Multiply(25.00, 67.00));
       System.out.println(p.Multiply("Rio", "Bharathi"));
    }
}