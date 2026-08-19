public class dsa_414 {
    public static int thirdmax(int[] nums)
    {
        int largest=Integer.MIN_VALUE;
        int seco_largest=Integer.MIN_VALUE;
        int third_largest=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums.length<=2 && nums[i]>largest)
            {
                largest=nums[i];
                return largest;
            }
            if(nums[i]>largest)
            {
                third_largest=seco_largest;
                seco_largest=largest;
                largest=nums[i];
            }
            if(nums[i]<largest && nums[i]>seco_largest)
            {
                third_largest=seco_largest;
                seco_largest=nums[i];
            }
            if(nums[i]<seco_largest && nums[i]>third_largest)
            {
                third_largest=nums[i];
            }
        }
        return third_largest;
    }
    public static void main(String[] args) {
        int nums[]={1,2};
        System.out.println(thirdmax(nums));
    }
}
