import java.util.PriorityQueue;

public class Declaration {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
        System.out.println(queue.peek());
        queue.offer(10);
        queue.offer(30);
        queue.offer(80);
        queue.offer(80);
        queue.offer(110);
        queue.offer(90);
        System.out.println(queue.peek());
        System.out.println(queue);
        queue.add(800);
        System.out.println(queue);
        System.out.println(queue.element());
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

    }
}