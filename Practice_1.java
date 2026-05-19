class College{
    String place;
    int startyear;

    void get(){
        System.out.println(place);
        System.out.println(startyear);
    }
}

public class Practice_1 {
    public static void main(String[] args) {
        College c1=new College();
        c1.place="Pullipalayam";
        c1.startyear=2015;
        c1.get();
    }
}
