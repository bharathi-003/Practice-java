class College{
    String name;
    int rollNumber;
    String collegeName;

    College(String n,int a,String m) {
        name=n;
        rollNumber=a;
        collegeName=m;
    }
    void update(){
        System.out.println(name+" "+rollNumber+" "+collegeName);
    }
}
public  class Exercise3{
    public static void main(String[] args) {
        College c1=new College("ragul",101,"ABC College");
        College c2=new College("Priya",102,"ABC College");
        College c3=new College("ARun",103,"ABC College");
        c1.update();
        c2.update();
        c3.update();
    }
}