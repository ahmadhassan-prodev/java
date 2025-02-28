import java.util.Scanner;

public class LAB6_Task_9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string which contains 'h' more than twice");
        String s1 = s.nextLine();
        int index1 = s1.indexOf('h');
        int indexL = s1.lastIndexOf('h');
        String sb1 = s1.substring(index1+1, indexL);
        String sb2 = sb1.replace('h','H');
        System.out.println(" Resulting String = " + s1.substring(0,index1+1) + sb2 + s1.substring(indexL));
    }
}
