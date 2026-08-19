public class max_subarray_sum2 {
    public static void max_sum(int nums[])
    {
        int max_sum=Integer.MIN_VALUE;
        int sum=0;
        int prefix[]=new int [nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                sum= i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                if(sum>max_sum)
                {
                    max_sum=sum;
                }
            }
        }
        System.out.println("max sum of subarrays is: "+max_sum);
    }
    public static void main(String[] args) {
        int[] nums={2,4,6};
        max_sum(nums);
    }
}

