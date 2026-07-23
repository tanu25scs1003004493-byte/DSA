import java.util.Scanner;

public class LeftRotateByOne {

    static void leftRotate(int[] nums) {
        int first = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = first;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        leftRotate(nums);

        System.out.println("Array after left rotation by one:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

