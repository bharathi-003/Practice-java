import java.util.*;
public class Index {
    public static void main(String[] args) {
        int[] arr =new int[5];
        arr[4]=1;
        arr[0]=76;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list =new ArrayList<>();
        list.add(23);
        list.add(34);
        list.add(56);
        list.addFirst(2111);
        list.remove(0);
        System.err.println(list.contains(34));

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(5555);
        list2.add(666);
        list.addAll(list2);
        System.out.println(list.containsAll(list2));
        list.get(0);
        Collections.sort(list);
        System.out.println(list);

        Scanner sc=new Scanner(System.in);
        ArrayList<String> user =new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            user.add(sc.next());
        }
        System.out.println(user);
    }
}
