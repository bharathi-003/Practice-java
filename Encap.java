class Student{
    private String name;
    private int age;

    public void setName(String n){
        name=n;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;

    }
    public int getAge(){
        return age;
    }
    
public static void main(String[] args) {
    Student s1=new Student();
    s1.setName("Rio");
    s1.setAge(20);
    System.out.println(s1.getName());
    System.out.println(s1.getAge());
    Student s2 =new Student();
    s2.setName("Bharathi");
    s2.setAge(21);
     System.out.println(s2.getName());
     System.out.println(s2.getAge());
}
}