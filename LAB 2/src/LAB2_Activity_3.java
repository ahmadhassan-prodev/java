import java.util.Scanner;

public class LAB2_Activity_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String firstName;
        String lastName;
        int age;
        double weight;
        System.out.println("Enter first name");
        firstName = s.nextLine();
        System.out.println("Enter last name");
        lastName = s.nextLine();
        System.out.println("Enter age");
        age = s.nextInt();
        System.out.println("Enter weight");
        weight = s.nextDouble();
        System.out.println("Name:"+ firstName +" " + lastName);
        System.out.println("Age:"+ age);
        System.out.println("Weight:"+ weight);

    }
}
