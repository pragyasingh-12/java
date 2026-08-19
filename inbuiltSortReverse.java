import java.util.Arrays;
import java.util.Collections;
public class inbuiltSortReverse {
    public static void printarr(Integer nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer nums[]={5,4,1,3,2};
        Arrays.sort(nums,Collections.reverseOrder());
        printarr(nums);
    }
}
