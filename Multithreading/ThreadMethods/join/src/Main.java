public class Main {
    public static void main(String args[]){
        TestJoinMethod1 t1=new TestJoinMethod1();
        TestJoinMethod1 t2=new TestJoinMethod1();
        TestJoinMethod1 t3=new TestJoinMethod1();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){System.out.println(e);}

        t2.start();
        t3.start();
    }
}
/*
join(): When the join() method is invoked, the current thread stops its execution and the thread goes into the wait state.
The current thread remains in the wait state until the thread on which the join() method is invoked has achieved its dead state.
If interruption of the thread occurs, then it throws the InterruptedException.
 */
class TestJoinMethod1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }catch(Exception e){System.out.println(e);}
            System.out.println(i);
        }
    }

}