public class dsa_202 {
    public static void main(String[] args) {
        int n=2;
        
        while(n!=1 && n!=4)
        {
            int sum =0 ;
            int original = n;
            while (original>0) 
            {
                int ld = original%10;
                int sq = ld*ld;
                sum = sum + sq;
                original = original/10;  
            }
            n = sum;
        }
        if (n == 1)
            System.out.println("happy number");
        else
            System.out.println("not");
    }
}
