import java.util.*;
public class transpose
 {
    int arr[][];
    int m;
    public transpose(int mm)
    {
        m=mm;
        arr=new int[m][m];
    }
    public void fillarray()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the array elements: ");;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    public void transpose()
    {
        System.out.println("transpose: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public void display()
    {
        System.out.println("original matrix: ");
        for(int i=0;i<m;i++)
            {
                for(int j=0;j<m;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            transpose();
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size: ");
        int mm=sc.nextInt();
        transpose obj=new transpose(mm);
        obj.fillarray();
        obj.display();
    }
}
