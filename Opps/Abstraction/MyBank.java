interface MyBank {
void write();
void read();

//declares only
}

class SBIread implements MyBank{

   @Override
    public void write(){
        System.out.println("SBIread");}
@Override
public void read(){
           System.out.println("");
       }

}