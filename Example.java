class Student{
    String name;
    int age;

     Student() {
        name="Rio";
        age=20;
    }

    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
    public class Example{
        public static void main(String[] args) {
            Student s1=new Student();
            s1.display();
        }
    }

