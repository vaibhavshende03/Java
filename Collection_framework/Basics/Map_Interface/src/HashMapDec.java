import java.util.HashMap;
import java.util.Map;

public class HashMapDec {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Vaibhav");
        map.putIfAbsent(1,"Vaibhav");
        map.putIfAbsent(10,"Vaibhav");
        map.putIfAbsent(6,"Vaibhav");
        map.putIfAbsent(7,"Vaibhav");
        map.put(2,"Aksh");
        map.put(3,"Vaishnav");
        map.put(4,"Sahil");
        map.put(5,"Ashu");
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.get(2));
        map.replace(6,"jon");
        map.replace(7,"Vaibhav","Bob");
        System.out.println(map);

    }
}
