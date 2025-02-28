import java.util.Scanner;

public class LAB_7_Task_8 {
    static void vowelcounter(String s)
    {
        s = s.toLowerCase();
        int counter = 0;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch == 'u')
            {
                counter++;
            }
        }
        System.out.println("Number of vowels in the string: " + counter);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = s.nextLine();
        vowelcounter(str);


    }
}
