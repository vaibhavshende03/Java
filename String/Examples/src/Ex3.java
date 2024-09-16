public class Ex3 {

    //check whether string is palindrome or not.

public static void usingStringBuilderMethods(String str){
    StringBuilder gtr=new StringBuilder(str);

    gtr.reverse();
    String s=gtr+"";
    if (str.equals(s)){
        System.out.println("Palindrome");
    }
    else {
        System.out.println("Not a Palindrome");
    }
}

public static void usingTwoPointer(String str){
    int left=0;
    int right=str.length()-1;
    boolean flag=true;

    while (left<right){


       if ( str.charAt(left)!= str.charAt(right)){
        flag=false;
        break;
       }

        left++;
        right--;

    }
    if (flag==true){
        System.out.println("It is a palindrome.");
    }
    else {
        System.out.println("It is Not Palindrome.");
    }
}
    public static void main(String[] args) {
    String str="abcdcba";
    usingStringBuilderMethods(str);
        System.out.println("======================");
        usingTwoPointer(str);

    }
}
