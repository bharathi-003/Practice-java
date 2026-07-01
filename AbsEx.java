abstract class Animal{
    abstract void Sound();
}
class Dog extends Animal{
    void Sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void Sound(){
        System.out.println("cat Meoww");
    }



    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();
        d.Sound();
        c.Sound();
    }
 }
