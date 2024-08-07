import java.util.Arrays;

//Write  a program to rotate an array clockwise i.e right side.
//and
//// Write  a program to rotate an array Anticlockwise i.e left side.
public class Ex15 {

    public static void clockWise(int ca[]){
        int temp=ca[ca.length-1];
        for (int i= ca.length-1;i>0;i--){
            ca[i]=ca[i-1];
        }
        ca[0]=temp;
        System.out.println("Clockwise Rotation:");
        System.out.println(Arrays.toString(ca));
    }
    public static void antoClockwise(int aca[]){
        int temp=aca[0];
        for (int i=0;i<aca.length-1;i++){
            aca[i]=aca[i+1];
        }
        aca[aca.length-1]=temp;
        System.out.println("Anti-Clockwise Rotation:");
        System.out.println(Arrays.toString(aca));
    }
    public static void main(String[] args) {
        int []array={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Original :"+Arrays.toString(array));
        antoClockwise(array);

        clockWise(array);

    }
}
