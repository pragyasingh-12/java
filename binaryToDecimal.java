import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        int dec=0;
        int pow=0;
        while(n>0)
        {
        int ld=n%10;
        dec=dec+(ld*(int)Math.pow(2, pow));
        
        n=n/10;
        pow++;
        }
        System.out.println(dec);
    }
}
