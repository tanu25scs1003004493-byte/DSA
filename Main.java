import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take the size of the array from the user
        System.out.print("Enter the number of elements: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input.");
            return;
        }
        int n = scanner.nextInt();

        // Check if array has enough elements
        if (n < 2) {
            System.out.println("Second Smallest: -1");
            System.out.println("Second Largest: -1");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize variables for tracking minimum values
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Initialize variables for tracking maximum values
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Single-pass traversal to find the elements
        for (int i = 0; i < n; i++) {
            int current = arr[i];

            // 1. Finding Smallest and Second Smallest
            if (current < smallest) {
                secondSmallest = smallest;
                smallest = current;
            } else if (current < secondSmallest && current != smallest) {
                secondSmallest = current;
            }

            // 2. Finding Largest and Second Largest
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        // Print Second Smallest
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second Smallest: -1");
        } else {
            System.out.println("Second Smallest: " + secondSmallest);
        }

        // Print Second Largest
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second Largest: -1");
        } else {
            System.out.println("Second Largest: " + secondLargest);
        }

        scanner.close();
    }
}
