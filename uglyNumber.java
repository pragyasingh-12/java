public class uglyNumber {
    public static void main(String[] args) {
       int n=14;
       while(n % 2 == 0)
{
    n = n / 2;
}

while(n % 3 == 0)
{
    n = n / 3;
}

while(n % 5 == 0)
{
    n = n / 5;
}
       if(n==1)
       {
        System.out.println("ugly");
       }
       else
       {
        System.out.println("not ugly");
       }
    }
}
