public class DemonThread {
    public static void main(String[] args) {
        MyThread3 myThread = new MyThread3();
        myThread.setDaemon(true); // myThread is daemon thread ( like Garbage collector ) now
        MyThread3 t1 = new MyThread3();
        t1.start(); // t1 is user thread
        myThread.start();
        System.out.println("Main Done");
    }

}
class MyThread3 extends Thread {
        /*
        Thread.setDaemon(boolean): Marks the thread as either a daemon thread or a user thread. When the JVM exits, all daemon threads are terminated.
         */
        public void run() {
            while (true) {
                System.out.println("Hello world! ");
            }
        }
}

