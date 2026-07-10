import java.util.*;
public class Pattern9 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        System.out.print("enter the number:");
        int size=sc.nextInt();
        for(int i=1; i<=size;i++){
            for(int j=i;j<size;j++){
                System.out.print(" " );
            }
                 for (int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*" );
            }
            System.out.println();
        }
           for (int i = size - 1; i >= 1; i--) {
           for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

        

