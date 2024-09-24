import java.util.Vector;


public class Declaration {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();
        v.add(10);
        v.add(50);
        v.add(60);
        v.add(80);
        System.out.println(v);
        v.add(1,100);
        System.out.println(v);
        System.out.println(v.get(1));
        v.set(1,500);
        System.out.println(v);
        v.remove(Integer.valueOf(500));
        System.out.println(v);
        v.clear();
        System.out.println(v);


    }
}