public class linear_search {
    // public static int linear(int[] nums,int key)
    // {
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(nums[i]==key)
    //         {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }
    // public static void main(String[] args) {
    //     int nums[]={2,4,6,8,10,12,14,16};
    //     int key=10;
    //     int index=linear(nums, key);
    //     if(index==-1)
    //     {
    //         System.out.println("not found");
    //     }
    //     else
    //     {
    //         System.out.println("key is found at index: "+index);
    //     }
    // }
    public static int linear(String arr[],String key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].equals(key))
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String arr[]={"dosa","idli","samosa","momos","pepsi"};
        String key="samosa";
        int index=linear(arr, key);
        if(index==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("found at index: "+index);
        }
    }
}
