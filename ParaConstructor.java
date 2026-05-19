class Anime{
    //paramaterized constructor
    String name;
    double rating;
    
    Anime(String name,double rating){
        this.name=name;
        this.rating=rating;
    }
    void display(){
        System.out.println(name+" "+rating);
    }
}

public class ParaConstructor {
    public static void main(String[] args) {
        Anime a=new Anime("Attack on Titan",9.5);
        a.display();
    }
}
