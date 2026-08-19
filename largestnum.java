
public class largestnum {
    public static int largest(int arr[])
    {
        int largest=Integer.MIN_VALUE;
        int index = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={20,38,48,8,29,2,99};
        System.out.println("largest element is : "+largest(arr));
    }
}
