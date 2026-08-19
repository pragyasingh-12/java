import java.util.Arrays;
public class inbuiltSort {
    public static void printarr(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[]={5,4,1,3,2};
        // for sorting in normal ascending order
        // Arrays.sort(nums); 
        // for sorting of selected elements only
        Arrays.sort(nums,0,3);
        printarr(nums);
    }
}
