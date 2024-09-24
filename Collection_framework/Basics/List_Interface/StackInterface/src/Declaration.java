import java.util.Stack;

public class Declaration {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        System.out.println(s.empty());
        s.push(10);
        s.push(50);
        s.push(60);
        System.out.println(s.search(50));
        System.out.println(s.empty());
        System.out.println(s.peek());
        System.out.println(s);
        s.pop();
        s.pop();
        System.out.println(s);



        Stack<String> stk= new Stack<>();
//pushing elements into Stack
        stk.push("Mac Book");
        stk.push("HP");
        stk.push("DELL");
        stk.push("Asus");
        System.out.println("Stack: " + stk);
// Search an element
        int location = stk.search("HP");
        System.out.println("Location of Dell: " + location);

    }
}