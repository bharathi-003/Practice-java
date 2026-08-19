import java.util.*;
class Car{
    String color;
    int Maxspeed;
    int acceleration;
    int tyreFriction;
    Car(String z,int x,int c,int v){
        color=z;
        Maxspeed=x;
        acceleration=c;
        tyreFriction=v;
    }
}
class Exercise{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Car car=new Car(input.next(),input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println(car.color);
        System.out.println(car.Maxspeed);
        System.out.println(car.acceleration);
        System.out.println(car.tyreFriction);
        input.close();
    }
}