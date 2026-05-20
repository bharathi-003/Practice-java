class college{
    college(){
        String name;
        int price;
        this(100);
        System.out.println("Default Constructer");
    }
    college(int id){
        System.out.println("Parameterzied constructor");
    }
}

public class ConstructorChain {
    public static void main(String[] args) {
        college c=new college();
    }
}
