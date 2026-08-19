public class diagonalSum2d {
    public static void diagonal_sum(int matrix[][])
    {
        int sum=0;

        //brute force (time complexity n^2)


        // for(int i=0;i<matrix.length;i++)
        // {
        //     for(int j=0;j<matrix[0].length;j++)
        //     {
        //         if(i==j)
        //         {
        //             sum=sum+matrix[i][j];
        //         }
        //         else if (i+j==matrix.length-1)
        //         {
        //             sum+=matrix[i][j];   
        //         }
        //     }
        // }


        //optimised code(time complexity n)
        


        for(int i=0;i<matrix.length;i++)
        {
            sum=sum+matrix[i][i];
            if(i!=matrix.length-1-i)
            {
                sum=sum+matrix[i][matrix.length-1-i];
            }
        }



        System.out.println(sum);

        
    }
    public static void printarr(int matrix[][])
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[][]={{1,2,3},{4,5,6},{7,8,9}};
        printarr(nums);
        diagonal_sum(nums);
    }
}
