interface A{
    void display();
}
interface B{
    void show(); 
}
class C implements A,B
{
    public void display(){
        System.out.println("java");
    }
    public void show(){
        System.out.println("program");
    }
}

public class PureInherit {
    public static void main(String[] args) {
        C obj=new C();
        obj.display();
        obj.show();
    }
}
