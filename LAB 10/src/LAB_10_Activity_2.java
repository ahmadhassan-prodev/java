public class LAB_10_Activity_2 {
    static boolean isPrime(int a)
    {
        boolean prime = true;
        for(int i=2; i<a; i++)
        {
            if(a%i==0)
                prime = false;
        }
        return prime;
    }

    public static void main(String[] args) {
        int[][] num = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
        System.out.println("The 2D array elements are as follows:");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        int counter =0;
        System.out.println("The Prime numbers in 2D array are as follows:");
        for(int i=0; i<3; i++)
        {
            for (int j=0; j<3; j++)
            {
                if(isPrime(num[i][j])==true)
                {
                    System.out.println(num[i][j]);
                    counter ++;
                }
            }
        }
        System.out.println("Total prime numbers = " + counter);
    }
}
