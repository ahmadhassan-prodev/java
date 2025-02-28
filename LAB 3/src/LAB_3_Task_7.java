import java.util.Scanner;
public class LAB_3_Task_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many tickets of Class A were sold?");
        int classA = s.nextInt();
        System.out.println("How many tickets of Class B were sold?");
        int classB = s.nextInt();
        System.out.println("How many tickets of Class C were sold?");
        int classC = s.nextInt();
        System.out.println("How many tickets of Class D were sold?");
        int classD = s.nextInt();
        int incomeA = classA * 20;
        int incomeB = classB * 15;
        int incomeC = classC * 10;
        int incomeD = classD * 5;
        int total_income = incomeA + incomeB + incomeC + incomeD;
        System.out.println("Income of class A tickets: $" + incomeA);
        System.out.println("Income of class B tickets: $" + incomeB);
        System.out.println("Income of class C tickets: $" + incomeC);
        System.out.println("Income of class D tickets: $" + incomeD);
        System.out.println("Total income: $" + total_income);
    }
}
