class Employee{
    String companyname;
    int employeeid;
    String Experience;

    Employee(String companyname,int employeeid,String Experience ){
        this.companyname=companyname;
        this.employeeid=employeeid;
        this.Experience=Experience;
    }
    void update(){
        System.out.println(companyname+" "+employeeid+" "+Experience);
    }
    
}

public class This {
    public static void main(String[] args) {
        Employee e=new Employee("Zogo",1004,"3years");
        e.update();
    }
}
