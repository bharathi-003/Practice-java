class Student {
      //method
      void display(){
        System.out.println("Medical");
      }
      //constructor
      Student(){
        System.out.println("Engineering");
      }
}


public class Constructor {
    public static void main(String[] args) {
        Student s=new Student();
        s.display();
    }
}
