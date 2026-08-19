import java.util.Scanner;

public class dsa_1929 {
    public static void main(String[] args) {
        int n=3;
        System.out.println("enter the elements: ");
        Scanner sc= new Scanner(System.in);
        int[] nums=new int[3];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        System.out.println("the original array: ");
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        System.out.println("the new array is: ");
        int[] ans=new int[2*n];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[i];
            ans[i+n]=nums[i];
        }
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
