class Counter{
    private int count=0;

    public void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}
class mythread extends Thread{
    private Counter counter;//as class is also a user-defined dataType

    //constructor
    public mythread(Counter counter){
        this.counter=counter;
    }
/*
By synchronizing the increment method, you ensure that only one thread can execute this method at a time, which prevents the race condition. With this change, the output will consistently be 2000.
 */
    @Override
    public synchronized void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
public class ExSync {
    public static void main(String[] args) {
        Counter counter = new Counter();
        mythread t1 = new mythread(counter);
        mythread t2 = new mythread(counter);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (Exception e) {

        }
        System.out.println(counter.getCount()); // Expected: 2000, Actual will be random <= 2000
    }
}

