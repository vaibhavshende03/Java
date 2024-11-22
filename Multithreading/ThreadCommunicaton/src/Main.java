class Customer{

    int amount=10000;
     synchronized void withDraw(int  amount){
         System.out.println("Going to withdrawing");
        if (this.amount<amount){
             System.out.println("Less balance; waiting for deposit...");
             try{
                 wait();
             }
             catch (Exception e){

             }

         }
        this.amount-=amount;
         System.out.println("withdraw completed...");

}

synchronized void deposit(int amount){
    System.out.println("going to deposite...");
    this.amount+=amount;
    System.out.println("deposite completed...");
    notify();
}

}
public class Main {
    public static void main(String[] args) {
    final Customer c=new Customer();
    new Thread(){
        @Override
        public void run() {
            c.withDraw(15000);
        }
    }.start();
        new Thread(){
            public void run(){c.deposit(10000);}
        }.start();
    }
}