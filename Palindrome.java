public class Palindrome{
    public static void main (String[] args){
        String s="college";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            rev+=c; 
        }
        System.out.println(rev);
       if(s.equals(rev)){
        System.out.println("palindrome");
       }
       else{
        System.out.println("Not a palindrome");
       }
    }
}