import java.util.*;
public class decSpaceTriangle{
    public static void main(String args[]) {
    
    //Question 5
        //Print the pattern below
        //   *
        //  **
        // ***        
        //****
        int n=4;
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}
