import java.util.*;
public class Pattern10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        System.out.print("enter the number:");
        int size=sc.nextInt();
        for(int i=1; i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*" );
            }
            System.out.println();
        }
        
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
