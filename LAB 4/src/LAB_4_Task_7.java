import java.util.Scanner;

public class LAB_4_Task_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int leng1, leng2, width1, width2;
        System.out.println("Enter the length of First rectangle");
        leng1 = s.nextInt();
        System.out.println("Enter the width of First rectangle");
        width1 = s.nextInt();
        System.out.println("Enter the length of Second rectangle");
        leng2 = s.nextInt();
        System.out.println("Enter the width of First rectangle");
        width2 = s.nextInt();
        int area1 = leng1 * width1;
        int area2 = leng2 * width2;
        if(area1>area2)
        {
            System.out.println("Rectangle 1 has greater area");
        }
        else if (area2 > area1)
        {
            System.out.println("Rectangle 2 has greater area");
        }
        else {
            System.out.println("Both rectangle have same area");
        }
    }
}
