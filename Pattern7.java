import java.util.*;
public class Pattern7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        System.out.print("enter the number:");
        int size=sc.nextInt();
        for(int i= 1; i<=size;i++){
            for(int j=size;j>i;j--){
                System.out.print(" " );
            }
                 for (int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*" );
            }
            System.out.println();
        }
    }
}