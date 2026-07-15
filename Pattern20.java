import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i < 2 * n; i++) {
            int stars = (i <= n) ? i : 2 * n - i;

            for (int j = 1; j <= stars; j++)
                System.out.print("*");

            for (int j = 1; j <= 2 * (n - stars); j++)
                System.out.print(" ");

            for (int j = 1; j <= stars; j++)
                System.out.print("*");

            System.out.println();
        }

        sc.close();
    }
}
