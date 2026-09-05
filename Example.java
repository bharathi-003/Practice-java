public class Example {
    public static void main(String[] args) {
        Cat.display();
        Dog dd = new Dog("Tommy", 1);
        Dog d = new Dog("Charlie", 2);
        System.out.println(d.s);
        System.out.println(dd.s);
        System.out.println(d.s);
        System.out.println(d.id);
    }
}

class Cat{

    static void display()
    {
        System.out.println("display");
    }
}


class Dog  {
    public int id;
    public String s;

    public Dog(String st, int id){
        s = st;
        this.id = id;
    }

}


