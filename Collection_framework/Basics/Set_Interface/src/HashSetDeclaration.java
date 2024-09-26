import java.util.HashSet;

public class HashSetDeclaration {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        System.out.println(set.isEmpty());
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(50);
        set.add(90);
        set.add(40);
        set.add(100);
        System.out.println(set);
        System.out.println(set.isEmpty());
        set.remove(100);
        System.out.println(set);
        System.out.println(set.contains(50));
        System.out.println(set.size());
        //==================================

        HashSet<String> s=new HashSet<>();
        s.add("Vaimm...");
        s.add("NextIn...");
        s.add("NextGen...");
        s.add("makeFace....");
        System.out.println(s);
    }
}
