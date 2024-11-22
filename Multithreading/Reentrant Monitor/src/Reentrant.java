public class Reentrant{
    public synchronized void m(){
        n();
        System.out.println("this is m() method");
    }
    public synchronized void n(){
        System.out.println("this is n() method");
    }

    public static void main(String[] args){
        Reentrant ren=new Reentrant();
        //Annonymous class
        Thread t1=new Thread(){
            public void run(){
                ren.m();
            }
        };
        t1.start();
    }
}