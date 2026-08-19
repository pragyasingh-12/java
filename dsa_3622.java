public class dsa_3622 {
    public static void main(String[] args) {
        int n=23;
        int original = n;
        int sum=0;
        int prod=1;
        while (n>0) 
        {
            int ld = n%10;
            sum = sum + ld;
            prod = prod * ld;
            n = n/10;
        }
        int s = sum+prod;
        System.out.println("sum of digits: "+sum);
        System.out.println("product: "+prod);
        System.out.println("sum of sum and prod: "+s);
        System.out.println("if n is divisible by the sum of sum and product of digits then print true else print false");
        if (original % s == 0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
