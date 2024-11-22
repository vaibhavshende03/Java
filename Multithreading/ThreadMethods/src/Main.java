 class MyThread extends Thread {
     public MyThread(String name) {
         super(name);
     }

     @Override
     public void run() {
         System.out.println("Thread is Running...");
         for (int i = 1; i <= 5; i++) {
             for (int j = 0; j < 5; j++) {
                 System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
                 try {
                     Thread.sleep(1000);
                 } catch (InterruptedException e) {
                     e.printStackTrace();

                 }
             }
         }
     }
 }
 class MyThread2 extends Thread {
     @Override
     public void run() {
         for (int i = 0; i < 5; i++) {
             System.out.println("=============================================");
             System.out.println(Thread.currentThread().getName() + " is running...");
             Thread.yield();

         }
     }
 }
public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*
        start( ): Begins the execution of the thread. The Java Virtual Machine (JVM) calls the run() method of the thread.
        run( ): The entry point for the thread. When the thread is started, the run() method is invoked. If the thread was created using a class that implements Runnable, the run() method will execute the run() method of that Runnable object.
        join( ): Waits for this thread to die. When one thread calls the join() method of another thread, it pauses the execution of the current thread until the thread being joined has completed its execution.
         interrupt(): Interrupts the thread. If the thread is blocked in a call to wait(), sleep(), or join(), it will throw an InterruptedException.
         yield(): Thread.yield() is a static method that suggests the current thread temporarily pause its execution to allow other threads of the same or higher priority to execute. It’s important to note that yield() is just a hint to the thread scheduler, and the actual behavior may vary depending on the JVM and OS.

        */
        MyThread l = new MyThread("Low Priority Thread");
        MyThread m = new MyThread("Medium Priority Thread");
        MyThread n = new MyThread("High Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        n.start();

        System.out.println("=============================================");
        MyThread2 t1=new MyThread2();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
        }

    }

