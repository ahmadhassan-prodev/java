import java.util.Scanner;

public class LAB_7_Task_3 {
    public static void displaySortedNumbers(double num1, double num2, double num3)
    {
        System.out.print("The numbers in increasing order are as follows: ");
        if(num1>num2 && num1>num3 && num2>num3)
            System.out.println(num3 + " , " + num2 + " , " +num1);
        else if(num1>num2 && num1>num3 && num3>num2)
            System.out.println(num2 + " , " + num3 + " , " +num1);
        else if(num2>num3 && num2>num1 && num1>num3)
            System.out.println(num3 + " , " + num1 + " , " +num2);
        else if(num2>num3 && num2>num1 && num3>num1)
            System.out.println(num1 + " , " + num3 + " , " +num2);
        else if(num3>num2 && num3>num1 && num1>num2)
            System.out.println(num2 + " , " + num1 + " , " +num3);
        else
            System.out.println(num1 + " , " + num2 + " , " +num3);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number 1 (eg, 18.54)");
        double num1 = s.nextDouble();
        System.out.println("Enter number 2 (eg, 18.54)");
        double num2 = s.nextDouble();
        System.out.println("Enter number 3 (eg, 18.54)");
        double num3 = s.nextDouble();
        displaySortedNumbers(num1,num2,num3);
    }
}
