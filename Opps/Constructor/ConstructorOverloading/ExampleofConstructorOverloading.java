package ConstructorOverloading;



class Box{
    double width,height,depth;

    // constructor used when no dimensions specified

    Box(){width=depth=height=0;}

    // constructor used when all dimension specified

    Box(double w,double h,double d){
        this.depth=d;
        this.height=h;
        this.width=w;
    }

    // compute and return volume

    double volume() { return width * height * depth; }
}


public class ExampleofConstructorOverloading {

    public static void main(String [] args)
    {
        // create boxes using the various constructors
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();

        double vol;

        // get volume of first box
        vol = myBox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        // get volume of second box
        vol = myBox2.volume();
        System.out.println("Volume of mybox2 is " + vol);


    }
}