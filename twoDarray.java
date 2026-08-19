import java.util.Scanner;

public class twoDarray {
    public static boolean search(int matrix[][],int key)
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==key)
                {
                    System.out.println("key is found at index: "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void largest(int matrix[][])
    {
        int lar=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]>lar)
                {
                    lar=matrix[i][j];
                }
            }
        }
        System.out.println("the largest element is: "+lar);
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        Scanner br=new Scanner(System.in);
        System.out.println("enter the key: ");
        int key=br.nextInt();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elements: ");
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix, key);
        largest(matrix);
    }
}
