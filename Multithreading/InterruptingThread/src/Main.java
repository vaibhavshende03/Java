
class TestInterruptingThread1 extends Thread{
    public void run(){
        try{
            Thread.sleep(5000);
            System.out.println("task");
        }catch(InterruptedException e){
            throw new RuntimeException("Thread interrupted..."+e);
        }

    }}

    public class Main {
    public static void main(String[] args) {
        TestInterruptingThread1 t1=new TestInterruptingThread1();
        t1.start();
        try {
            t1.interrupt();
        }
        catch (Exception e){
            System.out.println("Exception Handle."+ e);
        }


    }
}