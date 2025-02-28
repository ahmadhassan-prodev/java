public class LAB_5_Activity_7 {
    public static void main(String[] args) {
        System.out.println("    *** Multiplication Table ***");
        System.out.print("    ");
        for(int i=1; i<=10; i++)
        {
            System.out.print( i + "  ");
        }
        System.out.println();
        System.out.println("----------------------------------");
        for(int a=1; a<=10; a++)
        {
            if(a>=10)
            {
            System.out.print(a + "| ");
            }
            else {
                System.out.print(a + " | ");
            }
            for(int b=1; b<=10; b++)
            {
                System.out.print(a*b);
                if(a*b < 10)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
