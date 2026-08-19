public class dsa_1281 {
    public static void main(String[] args) {
        int num =234;
        int prod = 1;
        int sum=0;
        while(num>0)
        {
            int lastdig = num%10;
            sum = sum+lastdig;
            prod = prod*lastdig;
            num = num/10;
        }
        int dif = prod-sum;
        System.out.println(sum);
        System.out.println(prod);
        System.out.println(dif);
    }
}
