import java.util.Scanner;

public class arrayPrac {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.print("enter the 4 array elements: ");
        // int [] arr= new int [4];
        // for(int i=0;i<arr.length;i++)
        // {
        //     arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println("the array elements are: "+arr[i]+" ");
        // }


        // int [] arr={10,20,30,40};
        // int sum=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     sum=sum+arr[i];
        // }
        // System.out.println(sum);



        // int [] arr={2,5,9,4,1};
        // int largest=arr[0];
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]>largest)
        //     {
        //         largest= arr[i];
        //     }
        // }
        // System.out.println("the largest element is "+largest);


        // int[] arr={9,2,5,7};
        // for(int i=arr.length-1;i>=0;i--)
        // {
        //     System.out.print(arr[i]+" ");
        // }


        int[] arr={10,20,30,40,50};
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the target: ");
        int target=sc.nextInt();
        boolean found=false;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                found=true;
                index=i;
            }
        }
        if(found)
        {
            System.out.println("found at index: "+index);
        }
        else
        {
            System.out.println("not found");
        }
    }
}
