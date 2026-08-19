class Box<T>{
    T value;
    void setValue(T value){
        this.value=value;
    }
    T getValue(){
        return value;
    }
}
public class GenericsMethod{
    public static void main(String[] args) {
        Box<String> b=new Box<>();
        Box<String> e=new Box<>();
        b.setValue("Rio");
        e.setValue("Bharathi");
        System.out.println(b.getValue());
        System.out.println(e.getValue());
         
    }
}