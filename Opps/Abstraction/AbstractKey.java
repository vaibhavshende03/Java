abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}

public class AbstractKey {
    public static void main(String[] args){
        Shape s1=new Rectangle();
        s1.draw();
        System.out.println("--------------");
        Shape s2=new circle();
        s2.draw();
        System.out.println("---------------");
    }
}
