import java.util.*;
public class area_circle {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of radius: ");
        float r=sc.nextFloat();
        float area= 3.14f*r*r;
        System.out.println("the area is: "+area);
    }
}