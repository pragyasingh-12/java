import java.util.*;
public class dsa_prac3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("enter the number: ");
            int n=sc.nextInt();
            if(n%10==0)
            {
                break;
            }
            System.out.println(n);
        }
    }
    
}


/*import java.util.*;

public class dsa_prac3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for ( ; ; )   // infinite loop
        {
            System.out.println("enter the number: ");
            int n = sc.nextInt();

            if (n % 10 == 0)
            {
                break;
            }

            System.out.println(n);
        }
    }
} */