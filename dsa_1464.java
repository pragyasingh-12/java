public class dsa_1464 {
    public int maxProduct(int[] nums)
    {
        int max=0;
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                int curr=(nums[i]-1)*(nums[j]-1);
                if(curr>max)
                {
                    max=curr;
                    result=curr;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums={3,2,4,5};
        int output=maxProduct(nums);
        System.out.println("output is: "+output);
    }
}
