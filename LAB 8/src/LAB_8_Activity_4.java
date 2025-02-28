import java.util.Scanner;

public class LAB_8_Activity_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int[] copiedArray = new int[10];

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input elements in array");
            System.out.println("2. Search element and its location");
            System.out.println("3. Find largest & smallest value in the array");
            System.out.println("4. Copy data");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    input(array);
                    display(array);
                    break;
                case 2:
                    System.out.print("Enter element to search: ");
                    int searchKey = sc.nextInt();
                    search(searchKey, array);
                    break;
                case 3:
                    largestSmallest(array);
                    display(array);
                    break;
                case 4:
                    copyData(array, copiedArray);
                    System.out.println("Copied array:");
                    display(copiedArray);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to input elements into the array
    public static void input(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
    }

    // Method to display the array
    public static void display(int[] array) {
        System.out.print("Array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Method to search for an element in the array
    public static void search(int searchKey, int[] array) {
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchKey) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found.");
        }
    }

    // Method to find largest and smallest and rearrange the array
    public static void largestSmallest(int[] array) {
        int largest = array[0];
        int smallest = array[0];
        int largestIndex = 0;
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
                largestIndex = i;
            }
            if (array[i] < smallest) {
                smallest = array[i];
                smallestIndex = i;
            }
        }

        // Swap largest to index 0 and smallest to index 9
        int temp = array[0];
        array[0] = largest;
        array[largestIndex] = temp;

        temp = array[9];
        array[9] = smallest;
        array[smallestIndex] = temp;

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }

    // Method to copy data from one array to another
    public static void copyData(int[] sourceArray, int[] destinationArray) {
        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }
        System.out.println("Data copied successfully.");
    }
}
