public class spiral_matrix {
    public static void spiralMatrix(int[][] nums)
    {
        int startRow=0;
        int endRow=nums.length-1;
        int startcol=0;
        int endcol=nums[0].length-1;

        while(startRow<=endRow && startcol<=endcol)
        {
            //top
            for(int j=startcol;j<=endcol;j++)
            {
                System.out.print(nums[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.print(nums[i][endcol]+" ");
            }

            //bottom
            for(int j=endcol-1;j>=startcol;j--)
            {
                if(startRow==endRow)
                {
                    break;
                }
                System.out.print(nums[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1;i>=startRow+1;i--)
            {
                if(startcol==endcol)
                {
                    break;
                }
                System.out.print(nums[i][startcol]+" ");
            }
            startRow++;
            endRow--;
            startcol++;
            endcol--;
        }
        System.out.println();
    }
    public static void printarr(int[][] matrix)
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
        int nums[][]={{1,2,4},{5,6,7},{9,10,11},{14,15,16}};
        printarr(nums);
        spiralMatrix(nums);
    }
}
