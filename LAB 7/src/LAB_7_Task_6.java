import java.util.Scanner;

public class LAB_7_Task_6 {
    static String capitalize(String s)
    {
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter lowercase words: ");
        String str = s.nextLine();
        String[] st = str.split(" ");
        for(int i=0; i<st.length; i++)
        {
            System.out.print(capitalize(st[i]) + " ");
        }
    }
}
