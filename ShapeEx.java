abstract class Shape{
    abstract void area();
}
class Circle extends Shape{
    int radius=5;
    void area(){
        System.out.println(3.14*radius*radius);
    }
}
class Rectangle extends Shape{
    int l=25;
    int b=2;
    void area(){
        System.out.println((double)l*b);
    }
}
public class ShapeEx{
    public static void main(String[] args){
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        c.area();
        r.area();
    }
}