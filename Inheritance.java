class Animal{
    public void eating(){
        System.err.println("Animal is eating");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("wow wow");
    }
}
class Cat extends Animal{
    public void meow(){
        System.err.println("meow meow");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        Cat c=new Cat();

        d.bark();
        c.meow();
        d.eating();
    }
    
}
