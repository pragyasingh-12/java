import java.util.*;
public class powerof2 {
    public static void main(String[] args) {
        System.out.println("enter n: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int x=0;x<=n;x++)
        {
            if (n== Math.pow(2, x))
            {
                System.out.println("true");
            }
            else
            {
                System.out.println("false");
            }
        }
    }
}
