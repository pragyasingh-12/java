import java.util.*;
public class add_dig_leetcode {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();
        while(n>9)
        {
            int sum=0;
            while(n>0)
            {
                int dig=n%10;
                sum=sum+dig;
                n=n/10;
            }
            n=sum;
        }
        System.out.println(n);
    }
}