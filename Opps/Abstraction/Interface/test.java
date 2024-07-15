package Interface;

public class test {
    public static void main(String[] args) {
        Bank b1=new SBI();
        System.out.println("ROI-SBI:"+ b1.rateOfInterest());
        Bank b2=new PNB();
        System.out.println("ROI-PNB:"+ b2.rateOfInterest());
    }
}
