public class dsa_507 {
    public static void main(String[] args) {
        int num=7;
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                System.out.print(i+" ");
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(num==sum)
        {
            System.out.println("perfect number");
        }
        else
        {
            System.out.println("not perfect number");
        }
    }
}
