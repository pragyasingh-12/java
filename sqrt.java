import java.util.*;
public class sqrt {
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a=0;
        for (int i=1;i<=n;i++)
        {
            if(i*i==n)
            {
                System.out.println(i);
                return;
            }
            if (i*i<n)
            {
                a=i;
            }
            else{
                break;
            }
        }
        System.out.println(a);
    }
}
