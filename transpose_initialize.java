public class transpose_initialize {
    int arr[][];
    int rows;
    int cols;
    public transpose_initialize()
    {
        arr= new int[][]{
            {1,2,3},{4,5,6}
        };
        rows=arr.length;
        cols=arr[0].length;
    }
    public void transpose_initialize()
    {
        System.out.println("transpose matrix: ");
        for(int i=0;i<cols;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
    public void display()
    {
        System.out.println("original matrix: ");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        transpose_initialize();
    }
    public static void main(String[] args) {
        transpose_initialize obj= new transpose_initialize();
        obj.display();
    }
}
