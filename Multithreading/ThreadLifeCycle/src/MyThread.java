public class MyThread extends Thread {
        public void run(){
            System.out.println("Thread Running.....");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    public static void main(String[] args) throws InterruptedException {
        MyThread t1=new MyThread();
        System.out.println(t1.getState());//NEW
        t1.start();
        System.out.println(t1.getState());//RUNNABLE
        t1.sleep(1000);
        System.out.println(t1.getState());//TIMED_WAITING
        t1.join();
        System.out.println(t1.getState()); // TERMINATED




    }
}
