import java.util.Scanner;

public class LAB_3_Task_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your pay rate per hour: $");
        double payrate = s.nextDouble();
        System.out.print("Enter your worked hours per week: ");
        double workedhours = s.nextDouble();
        double income = 5 * payrate * workedhours;
        System.out.print("Income before tax: $");
        System.out.printf("%.2f\n", income);
        double tax = income * 0.14;
        income = income - tax;
        System.out.print("Income after tax: $");
        System.out.printf("%.2f\n", income);
        double clothes = income * 0.10;
        System.out.print("Money spend on clothes and other accessories: $");
        System.out.printf("%.2f\n", clothes);
        income = income - clothes;
        double supplies = income * 0.01;
        System.out.print("Money spend on school supplies: $");
        System.out.printf("%.2f\n", supplies);
        income = income - supplies;
        double saving_bonds = income * 0.25;
        System.out.print("Money spend to buy saving bonds: $");
        System.out.printf("%.2f\n", saving_bonds);
        income = income - saving_bonds;
        double parents_saving_bonds = saving_bonds * 0.50;
        System.out.print("Money parents spend to buy saving bonds: $");
        System.out.printf("%.2f", parents_saving_bonds);
    }
}
