public class Method{
    static String display(){
        String display="Hello world";
        return display;
    }
    public static void main(String[] args) {
        System.out.println("Before calling");
        System.out.println(display());
        System.out.println("After calling");
    }
}