public class Main {
    public static void main(String[] args) {

//       by class
       ThreadClass t1=new ThreadClass();

       t1.start();
//      by interface
       RunnableInterface t2=new RunnableInterface();
       Thread thread=new Thread(t2);
       thread.start();
    }
}