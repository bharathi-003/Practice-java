public class NestedIf {
    public static void main(String[] args) {
        int age=9;
        boolean isdrive=true;
        if(age>=18){
            if(isdrive){
                System.out.println("Licence is applicable");
            }
            else{
                System.out.println("Licence is not Apllicable");
            }
        }
        else{
            System.out.println("Not eligible for Licence");
        }
    }
}
