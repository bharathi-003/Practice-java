class Student{
    void display(){
        System.out.println("Java programming");
        System.out.println("Assesment Completed");
        System.out.println("3rd year");
    }
}
class Trainer extends Student{
     void details(){
        System.out.println("All students are pass their exam");
     }
}

public class Single {
    public static void main(String[] args) {
        Trainer t=new Trainer();
        t.details();
        t.display();
    }
}
