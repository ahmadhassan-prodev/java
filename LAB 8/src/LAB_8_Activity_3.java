import java.util.Scanner;

public class LAB_8_Activity_3 {
    public static void main(String[] args) {
        char[] ch = new char[10];
        int counter = 0;
        Scanner s = new Scanner(System.in);
        for(int i=0; i<10; i++)
        {
            System.out.print("Enter character " + (i+1) + " : ");
            ch[i] = s.next().charAt(0);
        }
        for(int i=0; i<10; i++)
        {
            for(int j=0; j<10; j++)
            {
                if(ch[i] == ch[j])
                    counter ++;
            }
            System.out.println(ch[i] + " occurs " + counter + " times");
            counter = 0;
        }

    }
}
