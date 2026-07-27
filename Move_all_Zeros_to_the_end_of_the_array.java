import java.util.Scanner;

public class Move_all_Zeros_to_the_end_of_the_array {

    public static void moveZeros(int[] arr) {
        int n = arr.length;

        int j = -1;

        // Find the first zero
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        // If there is no zero
        if (j == -1)
            return;

        // Move non-zero elements forward
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeros(arr);

        System.out.println("Array after moving zeros:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}