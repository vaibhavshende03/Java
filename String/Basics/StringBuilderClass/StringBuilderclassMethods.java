package StringBuilderClass;
import java.util.*;
public class StringBuilderclassMethods {
    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("setCharAt() Method :");
        StringBuilder str=new StringBuilder("Hello ");
        str.setCharAt(0, 'M');
        System.out.println(str);
        System.out.println("----------------------------------------");
         //------------------------------------------------------------
        StringBuilder str2=new StringBuilder("Hello ");
        //-------------------------------------------------------------
        System.out.println("append() Methods :");
        //The StringBuilder append() method concatenates the given argument with this String.
        //append() method is overloaded like append(char), append(boolean), append(int), append(float), append(double) etc.
        str2.append("World");
        //str2.append(20);
        System.out.println(str2);
        System.out.println("----------------------------------------");

        //The StringBuilder insert() method inserts the given string with this string at the given position.
        System.out.println("insert() Method:");
        str2.insert(5," Java");
        str2.insert(16,'H');
        System.out.println(str2);
        System.out.println("----------------------------------------");
        //to delete the char ate specified index at string
        System.out.println("deleteCharAt() Method:");
        str2.deleteCharAt(16);
        System.out.println(str2);
        System.out.println("----------------------------------------");
        //to revesre the string
        System.out.println("reverse() Method:");
        StringBuilder sb=new StringBuilder("Computer");
        sb.reverse();
        System.out.println(sb);
        System.out.println("----------------------------------------");
        //to delete the string at specified startIndex and endIndex
        System.out.println("delete() Method:");
        sb.delete(2,4);
        System.out.println(sb);
        System.out.println("----------------------------------------");
        //replace() method replaces the given string from the specified beginIndex and endIndex.
        System.out.println("replace() Method:");
        str2.replace(1,3,"Java");
        System.out.println(str2);
        System.out.println("----------------------------------------");
        System.out.println("capacity() Method:");
        System.out.println(str2.capacity());
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");







    }
}
