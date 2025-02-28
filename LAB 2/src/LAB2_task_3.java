import java.util.Scanner;

public class LAB2_task_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int SECRET = 11;
        double RATE = 12.50;
        int num1 , num2, newNum;
        String name;
        double hoursWorked, wages;
        System.out.println("Enter num1 :");
        num1 = console.nextInt();
        System.out.println("Enter num2 :");
        num2 = console.nextInt();
        System.out.println("The value of num1 = " + num1 + " and the value of num2 = " + num2);
        newNum = 2 * num1 + num2;
        System.out.println("The value of newNum = " + newNum);
        newNum = newNum + SECRET;
        System.out.println("After adding SECRET, the updated value of newNum = " + newNum);
        System.out.println("Enter your last name: ");
        name = console.next();
        System.out.println("Enter your worked hours between 0-70 ");
        hoursWorked = console.nextDouble();
        wages = hoursWorked * RATE;
        System.out.println("Name: " + name);
        System.out.println("Pay Rate: $" + RATE);
        System.out.println("Hours Worked: " + hoursWorked );
        System.out.println("Salary: $" + wages);

    }
}
