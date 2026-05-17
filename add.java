public class add {
    public static void main(String[] args){
        int a=10;
        int b=23;
        System.out.println(add(a,b));
        System.out.println(add(10,20));
        display();
        display();
    }
    public static int add(int a,int b){
        System.out.println("the number was added");
        return a+b;
    }
    public static void display(){
        System.out.println("This is helper function");
        System.out.println("print line 2");
    }
}
