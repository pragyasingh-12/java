import java.util.Arrays;
public class dsa_1365 {
    public static int[] smallerthancurrent(int nums[])
    {
        int[] result=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int current=nums[i];
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j && nums[j]<nums[i])
                {
                    count++;
                }
            }
            result[i]=count;
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[]={8,1,2,2,3};
        int[] res=smallerthancurrent(nums);
        System.out.println(Arrays.toString(res));
    }
}
