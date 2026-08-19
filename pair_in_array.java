public class pair_in_array {
    public static void pairsInArray(int[] nums)
    {
        int totalPairs=0;
        for(int i=0;i<nums.length;i++)
        {
            int currentElement = nums[i];
            for(int j=i+1;j<nums.length;j++)
            {
                System.out.print("("+currentElement+","+nums[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("total pairs: "+totalPairs);
    }
    public static void main(String[] args) {
        int nums[]={1,3,5};
        pairsInArray(nums);
    }
}
