import java.util.Stack;

public class LiFo {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();
        Stack<String> stack2=new Stack<>();
        Stack<Character> stack3=new Stack<>();

        stack1.push(4);
        stack1.push(6);
        stack1.push(7);
        System.out.println(stack1.get(2));
        System.out.println(stack1);
        int k=stack1.pop();
        System.out.println(k);
        stack1.pop();
        System.out.println(stack1.isEmpty());
        System.out.println(stack2.isEmpty());
        Stack<Integer> st= new Stack<>();
        st.push(12);
        st.push(55);
        stack1.addAll(st);
        System.err.println(stack1);
        stack1.pop();
        int g = stack1.peek();
        System.out.println(g);


        //rev stack
        Stack<Character> stack=new Stack<>();
             String s="hello";
        for(int i=0;i<s.length();i++)
            {
                char c=s.charAt(i);
                stack.push(c);
        }
        String res="";
        while (!stack.isEmpty()) {
            char c=stack.pop();
            res=res+c;
        }
        System.out.println(stack);
        System.out.println(res);
    }

}

