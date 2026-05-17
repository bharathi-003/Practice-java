interface A {
   public void barking();
}
interface B {
    public void barking();
}
class C implements A,B {
    public void barking(){
        System.out.println("The multiple inheritance");
    }

}

public class Index {
    public static void main(String[] args) {
        C c = new C();
        c.barking();
    }
}
