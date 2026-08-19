class Box<T>{
    T value;
}
public  class Generics{
    public static void main(String[] args) {
        Box<Integer> b=new Box<>();//any data type can used in Generics
        b.value=34;
        System.out.println(b.value);
    }
}