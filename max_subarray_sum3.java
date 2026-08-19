public class max_subarray_sum3 {
    public static void kadanes(int nums[])
    {
        int curr_sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0 && nums[i]>max_sum)
            {
                max_sum=nums[i];
            }
            curr_sum=curr_sum+nums[i];
            max_sum = Math.max(curr_sum, max_sum);
            if(curr_sum<0)
                {
                    curr_sum=0;
                }
        }
        System.out.println("the max subarray sum is: "+max_sum);
    }
    public static void main(String[] args) {
        int nums[]={-2,-3,-1,-4};
        kadanes(nums);
    }
}
