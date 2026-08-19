public class max_subarray_sum1 {
    public static void max_sum(int nums[])
    {
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int sum=0;
            for(int j=i;j<nums.length;j++)
            {
                sum=sum+nums[j];
                for(int k=i;k<=j;k++)
                {
                    System.out.print(nums[k]+" ");
                }
                System.out.print("sum is: "+sum);
                if(sum>max_sum)
                {
                    max_sum=sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("max sum of subarrays is: "+max_sum);
    }
    public static void main(String[] args) {
        int nums[]={2,4,6,8,10};
        max_sum(nums);
    }
}
