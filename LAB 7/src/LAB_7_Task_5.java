import java.util.Scanner;

public class LAB_7_Task_5 {
    public static int countLetters(String s)
    {
        int letters = s.length();
        return letters;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the word:");
        String word = s.nextLine();
        System.out.println("The letters in String \'" + word + "\' are " + countLetters(word));
    }
}
