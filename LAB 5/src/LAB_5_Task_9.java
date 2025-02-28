import java.util.Scanner;

public class LAB_5_Task_9 {
    public static void main(String[] args) {
        int pattern;
        char repeat = 'Y';
        Scanner s = new Scanner(System.in);
        System.out.println("-> Which pattern do you want to print?");
        System.out.println("1) ****   2) *    3)  *   4)  *    5)  1");
        System.out.println("   ****      **      **      ***      222");
        pattern = s.nextInt();
        switch (pattern)
        {
            case 1:
                while(repeat!='N') {
                    for (int a = 1; a <= 5; a++) {
                        for (int b = 1; b <= 10; b++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Do you want to perform the operation again. Enter Y/N");
                    repeat = s.next().charAt(0);
                }
                break;
            case 2:
                while(repeat!='N') {
                   for(int a=1; a<=5; a++)
                   {
                       for(int b=0; b<a; b++)
                       {
                           System.out.print("*");
                       }
                       System.out.println();
                   }
                    System.out.println("Do you want to perform the operation again. Enter Y/N");
                    repeat = s.next().charAt(0);
                }
                break;
            case 3:
                while(repeat!='N') {
                    for (int a = 1; a <= 5; a++)
                    {
                        for(int b=5; b>a; b--)
                        {
                            System.out.print(" ");
                        }
                        for(int c=0; c<a; c++)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Do you want to perform the operation again. Enter Y/N");
                    repeat = s.next().charAt(0);
                }
                break;
            case 4:
                while(repeat!='N') {
                    for (int a = 1; a <= 5; a++) {
                        for(int b=5; b>a; b--)
                        {
                            System.out.print(" ");
                        }
                        for(int c=0; c<(2*a-1);c++)
                        {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    System.out.println("Do you want to perform the operation again. Enter Y/N");
                    repeat = s.next().charAt(0);
                }
                break;
            case 5:
                while(repeat!='N') {
                    for (int a = 1; a <= 5; a++) {
                        for(int b=5; b>a; b--)
                        {
                            System.out.print(" ");
                        }
                        for(int c=0; c<(2*a-1);c++)
                        {
                            System.out.print(a);
                        }
                        System.out.println();
                    }
                    System.out.println("Do you want to perform the operation again. Enter Y/N");
                    repeat = s.next().charAt(0);
                }
                break;
            default:
                System.out.println("Invalid Option!");
        }
    }
}
