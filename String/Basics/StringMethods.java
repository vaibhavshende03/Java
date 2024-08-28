public class StringMethods {
    public  static void main(String[] args){
        String s="Hello World";
        String s2="Java";
        String s3="Hello";
        String s4="Hello World";
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        //--------------------------
        System.out.println(s.indexOf(" "));
        System.out.println(s.indexOf('l'));
        //-----------------------------
        System.out.println(s.compareTo(s2));
        System.out.println(s.compareTo(s3));
        System.out.println(s.compareTo(s4));
        //-----------------------------
        System.out.println(s.contains("World"));
        System.out.println(s.contains("rld"));
        System.out.println(s.contains("Hello"));
        System.out.println(s.contains("hjg"));
        //-----------------------------
        System.out.println(s.startsWith("Hell"));
        System.out.println(s.endsWith("rld"));
        //-----------------------------
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        String name="Jon";
        String surName="Doe";
        System.out.println(name.concat(surName));
        //-----------------------------
        String str="abcde";
        str+="xyz";
        System.out.println(str);
        str+=10;
        System.out.println(str);
        System.out.println("abc"+10+20);
        System.out.println("abc"+(10+20));
        System.out.println(10+20+"abc");
        System.out.println(10+"abc"+20);

        //----------------------------------------

        System.out.println(str.substring(2));
        System.out.println(str.substring(0,4));

        //----------------------------------------

        //----------------------------------------

        //----------------------------------------

        //----------------------------------------

        //----------------------------------------

        //----------------------------------------

        //----------------------------------------

        //----------------------------------------


    }

}
