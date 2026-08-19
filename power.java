import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double x= sc.nextDouble();
        int n=sc.nextInt();
        double result;
        if (n==0)
        {
            result= 1;
        }
        else 
        {
            result= (Math.pow(x, n));
        }
        System.out.println(result);
    }
}
