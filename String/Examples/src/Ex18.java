public class Ex18 {
    // Write a program to replace the words from a given sentence.

    public static String replace(String s, String oldWord,String newWord){
        String[] ans=s.split(" ");
        String  result="";
        for (int i = 0; i < ans.length; i++) {

            if (ans[i].equals(oldWord)){
            result+=newWord+" ";
            }
            else {
                result+=ans[i]+ " ";
            }
            
        }
        return result;
    }
    
    public static void main(String[] args) {
        String str="“He played the violin beautifully";
        System.out.println(replace(str,"beautifully","violently"));




    }
}
