import java.util.Scanner;

public class LAB6_Activity_3 {
    public static void main(String[] args) {
//        Comparing two cities
        Scanner s = new Scanner(System.in);
        System.out.println("Enter city 1");
        String city1 = s.nextLine();
        System.out.println("Enter city 2");
        String city2 = s.nextLine();
//        compare cities according to their first character
        if(city1.compareTo(city2)<0)//if first character of city 1 is lower than city 2
//            in case of City1 = "Arifwala", City2 = "Sahiwal"
//            A from Arifwala is placed at 1 place
//            S from Sahiwal place at 19
//            So (1/19) < 0 ;
        {
            System.out.println("The cities in alphabetical order are " + city1 + " " + city2);
        }
        else{
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);
        }
    }
}
