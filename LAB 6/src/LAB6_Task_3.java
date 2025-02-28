import java.util.Scanner;

public class LAB6_Task_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        interger to hexa value
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 0 and 15: ");
        int number = input.nextInt();
        if (number >= 0 && number <= 15) {
            // Convert the integer to a hexadecimal string
            String hexValue = Integer.toHexString(number).toUpperCase();
            System.out.println("The hexadecimal value for " + number + " is " + hexValue);
        } else {
            System.out.println("Invalid input! Please enter a number between 0 and 15.");
        }
//      hexa to binary
        System.out.print("Enter a hexadecimal digit (0-9, A-F): ");
        String hexInput = s.nextLine().toUpperCase();
        if (hexInput.length() == 1 && ((hexInput.charAt(0) >= '0' && hexInput.charAt(0) <= '9') ||
                        (hexInput.charAt(0) >= 'A' && hexInput.charAt(0) <= 'F'))) {
            int decimalValue = Character.digit(hexInput.charAt(0), 16);
            String binaryValue = Integer.toBinaryString(decimalValue);
            System.out.println("The binary value for hexadecimal digit " + hexInput + " is " + binaryValue);
        } else {
            System.out.println("Invalid input! Please enter a valid hexadecimal digit (0-9, A-F).");
        }
    }
}
