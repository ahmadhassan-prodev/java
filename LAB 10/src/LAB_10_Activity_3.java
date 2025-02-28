
public class LAB_10_Activity_3 {

    static int[][] transpose(int[][] a)
    {
        int[][] trans = new int[4][3];
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<3; j++)
            {
                trans[i][j] = a[j][i];
            }
        }
        return trans;
    }
    public static void main(String[] args) {
        int[][] arr = {{11, 12, 13,20}, {14, 15, 16,21}, {17, 18, 19,22}};
        int[][] trans = new int[4][3];
        System.out.println("The 2D array elements are as follows:");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        trans = transpose(arr);
        System.out.println("Transpose of array is as follows:");
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
