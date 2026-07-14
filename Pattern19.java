
    public class Pattern19 {
    public static void main(String[] args) {
        int n =5; 

    
        for (int i = n; i >= 1; i--) {
            printRow(i, n);
        }
        
        for (int i = 2; i <= n; i++) {
            printRow(i, n);
        }
    }

    private static void printRow(int stars, int total) {
        
        for (int j = 0; j < stars; j++) System.out.print("*");
        
        for (int j = 0; j < 2 * (total - stars); j++) System.out.print(" ");
        
        for (int j = 0; j < stars; j++) System.out.print("*");
        System.out.println();
    }
}


