import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= 2 * (rows - i); k++)
                 { 
                    System.out.print(" ");
                 } 
                    for (int l = i; l >= 1; l--) 
                        { 
                            System.out.print(l);
                         } System.out.println(); 
                        } 
                    } 
                }



       