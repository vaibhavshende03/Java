import java.util.ArrayList;
public class arrayListExamples {
    public static void main(String[] args) {
        /*
             -->The ArrayList class implements the List interface.
             -->It uses a dynamic array to store the duplicate element of different data types.
             -->The ArrayList class maintains the insertion order and is non-synchronized.
         */

        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(10);
        list1.add(50);
        list1.add(30);
        list1.add(20);
        list1.add(50);
        list1.add(30);
        list1.add(40);
        list1.add(3,600);

        System.out.println(list1);
        list1.remove(6);
        System.out.println(list1);
        System.out.println(list1.get(5));
        list1.set(2,100);
        System.out.println(list1);
        System.out.println(list1.isEmpty());
        System.out.println("============================");
        ArrayList<Integer> list2 =new ArrayList<Integer>();
        list2.add(10);
        list2.add(50);
        list2.add(30);
        list2.add(20);
        list2.add(50);
        list2.add(30);
        list2.add(40);
        list2.clear();
        System.out.println(list2);

        System.out.println("============================");

        ArrayList<String> list=new ArrayList<String>();
        list.add("Bob");
        list.add("Alice");
        list.add("Jon");
        System.out.println(list);


    }
}
