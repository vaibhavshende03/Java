package ExNonSync;

class Counter{
    private int count=0;
/*
The output of the code is not 2000 because the increment method in the Counter class is not synchronized. This results in a race condition when both threads try to increment the count variable concurrently.

Without synchronization, one thread might read the value of count before the other thread has finished writing its incremented value. This can lead to both threads reading the same value, incrementing it, and writing it back, effectively losing one of the increments.
 */
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

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }
    }
public class ExNonSync {
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

