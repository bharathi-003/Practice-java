class Students<T,U>{
    int id;
    String name;
    Students(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println(id);
        System.out.println(name);
    }
}
public class MultipleGeneric{
    public static void main(String[] args) {
        Students<Integer,String> s=new Students<>(101,"Bharathi");
        s.display();
    }
}