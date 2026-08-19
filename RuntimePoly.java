class Animal{
    void Sound(){
        System.out.println("Animal");
    }
}
class Dog extends Animal{
    @Override
    void Sound(){
        System.out.println("Bark");
    }
}
public class RuntimePoly{
    public static void main(String[] args) {
        Animal a=new Dog();
        a.Sound();
    }
}
