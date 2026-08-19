import java.util.*;

public class codeforces { 
    public static void main(String[] args) {

        //4A


        // Scanner sc = new Scanner(System.in);
        // int w = sc.nextInt();
        // if (w % 2 == 0 && w > 2) {
        //     System.out.println("YES");
        // } else {
        //     System.out.println("NO");
        // }


        //50A


        // Scanner sc= new Scanner(System.in);
        // int M=sc.nextInt();
        // int N=sc.nextInt();
        // int d=0;
        // if(M%2==0 || N%2==0)
        // {
        //     d=(M*N)/2;
        // }
        // else
        // {
        //     d=((M*N)-1)/2;
        // }
        // System.out.println(d);


        //158 A 


        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            int val=sc.nextInt();
            if(val>k)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}

