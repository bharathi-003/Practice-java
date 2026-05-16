public class Equals {
    public static void main(String[] args) {
        String str =new String("hello");//object
        StringBuilder sb=new StringBuilder("hello");//no sync,faster
        sb.append("Students");
        String str1="hello";//scp(String constant pool)
        System.out.println(str.equals(str1));//content
        System.out.println(str==str1);//address

        //compile time and runtime concatenation
        int a=1;
        int b=2;
        //a+b;
        str="ram";
        str1="Ram"+"Charen";//compile time
        System.out.println(str1);
        System.out.println(str=="RamCharan");
        //str1=="RamCharan";
        str1=str+"Charen";//runtime time it act like append and new object
        System.out.println(str1);

        System.out.println(str1=="RamCharan");
        int n=str1.length();
        str1.charAt(1);
        str1.charAt(n-1);
        str1.substring(3);//start 3-last
        str1.substring(3,6);// start 3-stop before the stop value

        //contains
        str1.contains("Cha");//true
        str1.contains("cha");//false different casses

        //replace()
        str.replace('a', 'x');//RxmChxrxn


        //str1=="RamCharen"//false
        System.out.println(str+str1);//RamCharan

        String s1=new String("Hello");
        String s2=s1.intern();
        String s3="Hello";
        System.out.println(s1==s3);
        System.out.println(s2==s3);
    }
}
