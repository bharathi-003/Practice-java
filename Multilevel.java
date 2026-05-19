class Student{
    void display(){
        System.out.println("IT");
    }
}
class Staff extends Student{
    void get(){
    System.out.println("IT"+" "+"AIDS"+" "+"CSE");
    }
}
class Principle extends Staff{
    void details(){
        System.out.println("All Departments are under controll");
    }
}


public class Multilevel {
    public static void main(String[] args) {
        Principle pc=new Principle();
        pc.display();
        pc.get();
        pc.details();
        Staff s=new Staff();
        pc.display();
        pc.get();
    }
}
