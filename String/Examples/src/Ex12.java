import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Ex12 {
    // Write a program to convert a string into uppercase

    public static void main(String[] args) {
        String s="Vaibhav";
        String ans="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);

            if (ch>='a' && ch<='z'){
                ans+=(char)(ch-32);
            }
            else {
                ans+=ch;
            }
        }
        System.out.println(ans);
    }

}
