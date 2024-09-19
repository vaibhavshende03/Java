public class Ex19 {
// Write a program to check which word is largest in length in the given String

    public static void main(String[] args) {
String s="My Name is vaibhav";
String[] word =s.split(" ");
int max=0;
int index=0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length()>max){
                max= word[i].length();
                index=i;

            }
        }
        System.out.println("The word '"+word[index]+"' is the largest word with the length "+max+".");
    }
}
