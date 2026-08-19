/* WITHOUT FUNCTION

public class prime_in_range {
    public static void main(String[] args) {
        for(int n=1;n<=20;n++)
        {
            boolean isPrime = true;
            if (n<=1)
            {
                isPrime=false;
            }
            for (int i=2;i<=(n-1);i++)
            {
                if(n%i==0)
                {
                    isPrime=false;
                    break;
                }
            }
            if (isPrime)
            {
                System.out.println(n);
            }
        }
    }
}
 */

//WITH FUNCTION


public class prime_in_range {

    public static boolean isPrime(int n)
    {
        boolean isPrime = true;

        if(n <= 1)
        {
            isPrime = false;
        }

        for(int i = 2; i <= (n - 1); i++)
        {
            if(n % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }
}