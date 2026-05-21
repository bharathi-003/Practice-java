import java.util.*;
 class Student 
 {
    static String college="Shanmugha";
    int rollno;
    Student(int rollno)
    {
        this.rollno=rollno;
    }
    void display()
    {
        System.out.println(college+" "+rollno);
    }
 }
 public class main{
    public static void main(String[] args) {
        Student s=new Student(101);
        Student st=new Student(102);
        s.display();
        st.display();
    }
 }
