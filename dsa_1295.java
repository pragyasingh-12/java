public class dsa_1295 {
    public static int findnum(int nums[])
    {
        int evencount=0;
        for(int i=0;i<nums.length;i++)
        {
            int current=nums[i];
            int digcount=0;
            while(current!=0)
            {
                current=current/10;
                digcount++;
            }
            if(digcount%2==0)
            {
                evencount++;
            }
        }
        return evencount;
    }
    public static void main(String[] args) {
        int nums[]={437,315,322,431,686,264,442};
        int result=findnum(nums);
        System.out.println(result);
    }
}
