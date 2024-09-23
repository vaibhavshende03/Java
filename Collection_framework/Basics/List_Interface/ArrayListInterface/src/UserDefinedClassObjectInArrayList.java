import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollNo;
    String Name;
    int age;

    Student(int rollNo,String name,int age){
        this.rollNo=rollNo;
        this.Name=name;
        this.age=age;
    }
}

class Book{
    int id;
    String author,name,publisher;
    int quantity;
    public Book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
}


public class UserDefinedClassObjectInArrayList {
    public static void main(String[] args) {
        Student s1=new Student(1,"Jon",20);
        Student s2=new Student(2,"Bob",19);

        //Important :(Here we create a ArrayList Of Student UserDefined Class(User defined DataType)

        ArrayList<Student> list=new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        Iterator itr= list.iterator();

//        while (itr.hasNext()){
//            Student st=(Student) itr.next();
//            System.out.println(st.rollNo+" "+st.Name+" "+st.age);
//        }

        for (Student s:list){
            System.out.println(s.rollNo+" "+s.Name+" "+s.age);
        }
        System.out.println("====================================");
        /*For Books*/

        //Creating list of Books
        ArrayList<Book> l1 =new ArrayList<Book>();
        //Creating Books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //Adding Books to list
        l1.add(b1);
        l1.add(b2);
        l1.add(b3);
        //Traversing list
        for(Book b: l1){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }

    }
}

