class Calculation{
    void greatest(int a,int b){
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
    void greatest(double a,double b){
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculation c=new Calculation();
        c.greatest(10,20);
        c.greatest(10.0, 20.0);
    }
}
