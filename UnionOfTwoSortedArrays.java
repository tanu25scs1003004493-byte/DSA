import java.util.Scanner;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TreeSet<Integer> set = new TreeSet<>();

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("Union of the arrays:");

        for (int num : set) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}