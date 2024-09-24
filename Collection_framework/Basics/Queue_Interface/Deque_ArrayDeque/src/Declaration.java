import java.util.ArrayDeque;


public class Declaration {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();


        System.out.println(dq.peek());
        for (int i = 1; i < 6; i++) {
            dq.add(i);
        }
        for (int i = 6; i < 10; i++) {
            dq.offer(i);
        }
        System.out.println(dq);
        System.out.println(dq.element());
        System.out.println(dq.peek());
        dq.offerFirst(100);
        dq.offerLast(1000);
        System.out.println(dq);
        dq.offerFirst(100);
        dq.offerLast(1000);
        System.out.println(dq);
        dq.pollFirst();
        dq.pollLast();
        System.out.println(dq);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

    }
}