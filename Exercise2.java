class Employee{
    int id;
    String name;
    int salary;

     Employee() {
        id=101;
        name="Bharathi";
        salary=25000;
    }
    void update(){
        System.out.println("Employee id:"+id);
         System.out.println("Name:"+name);
         System.out.println("Salary:"+salary);
    }
}
public class Exercise2{
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.update();
    }
}