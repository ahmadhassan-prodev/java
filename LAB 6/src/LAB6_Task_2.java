import java.util.Scanner;

public class LAB6_Task_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        ASCII code to character
        System.out.print("Enter an ASCII code(between 0-127): ");
        int num = s.nextInt();
//        used to get ascii equivalent character
        char character = (char) num;
        System.out.println("The character for ASCII code " + num + " is '" + character + "'.");

//      character to ascii code
        System.out.print("Enter the character: ");
        char c = s.next().charAt(0);
        int num2 = (int) c;
        System.out.println("The Unicode for the character " + c + " is " + num2);
    }
}
