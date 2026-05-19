class Games{
    String name;
    String Strenght;
    Games(){
        name="Dhoni";
        Strenght="Captain cool";
    }
    void display(){
        System.out.println(name+" "+Strenght);
    }
}
class Cricket extends Games{
    String team;
    int members;
    Cricket(String team,int members){
        this.team=team;
        this.members=members;
    }
    void details(){
        System.out.println(team+" "+members);
    }
}

public class SingleExample {
    public static void main(String[] args) {
        Cricket c=new Cricket("Csk", 11);
        c.details();
        c.display();
    }
}
