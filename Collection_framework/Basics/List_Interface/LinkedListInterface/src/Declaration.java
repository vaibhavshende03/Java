import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Declaration {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        System.out.println(list.peek());
        list.add(10);
        list.add(20);
        list.add(90);
        list.add(18);
        list.add(80);
        list.add(60);
        list.add(40);
        System.out.println(list);
//        Collections.reverse(list);
//        System.out.println(list);
        list.addFirst(5);
        list.addLast(100);
        System.out.println(list);
        list.remove();//remove first element
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.indexOf(18));
        System.out.println(list.lastIndexOf(5));//return las occurrence of element

    }
}
