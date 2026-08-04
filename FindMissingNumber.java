import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        // Using long to prevent any mathematical overflow
        long n = scanner.nextLong(); 

        System.out.println("Enter " + (n - 1) + " numbers:");
        long arraySum = 0;
        for (int i = 0; i < n - 1; i++) {
            arraySum += scanner.nextLong();
        }

        // Formula using long arithmetic
        long totalSum = n * (n + 1) / 2;
        long missingNumber = totalSum - arraySum;

        System.out.println("The missing number is: " + missingNumber);
        scanner.close();
    }
}
