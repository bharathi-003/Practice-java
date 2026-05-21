class Student{
    void display(){
        System.out.println("Rio");
    }
}
final class Staff extends Student{
    void show(){
        System.out.println("003");
    }
}

public class FinalClass {
    public static void main(String[] args) {
        Staff s=new Staff();
        s.show();
    }
}
