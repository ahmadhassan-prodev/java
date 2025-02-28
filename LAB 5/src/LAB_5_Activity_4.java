import java.util.Scanner;

public class LAB_5_Activity_4 {
    public static void main(String[] args) {
        int counter = 1;
        Scanner s = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        System.out.println("*** Number Guessing Game ***");
        System.out.println("Guess the number from 0-100");
        int guess = s.nextInt();
        while (guess != number) {
            if (guess > number) {
                System.out.println("Your guess is higher than number.");
                System.out.println("Guess again!");
                guess = s.nextInt();
            } else if (guess < number) {
                System.out.println("Your guess is lower than number.");
                System.out.println("Guess again!");
                guess = s.nextInt();
            }
            counter++;
        }
        System.out.println("You guessed the exact number!");
        System.out.println("Attempts = " + counter);
    }
}
