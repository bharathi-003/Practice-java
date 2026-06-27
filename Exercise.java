class Student{
    String name;
    int age;
    double cgpa;
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("CGPA:"+cgpa);
    }
}
public class Exercise{
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Bharathi";
        s1.age=20;
        s1.cgpa=7.5;
        s1.display();
    }
}