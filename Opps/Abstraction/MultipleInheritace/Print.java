package MultipleInheritace;

interface PrintTable{
    void printMsg();
}
interface Showable{
    void showMsg();
}

public class Print implements PrintTable,Showable{
    public void printMsg(){
        System.out.println("Hello");
    }
    public void showMsg(){
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Print obj=new Print();
        obj.printMsg();
        obj.showMsg();
    }
}
