import java.util.Scanner;

public class dsa_1480 {
    public static void main(String[] args) {
        System.out.println("enter the size of array: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Scanner br=new Scanner(System.in);
        int[] nums= new int[n];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=br.nextInt();
        }
        System.out.println("the input array is: ");
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println("the output array is: ");
        for(int j=0;j<nums.length;j++)
        {
            sum=sum+nums[j];
            System.out.print(sum+" ");
        }
    }
}
