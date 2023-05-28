import java.util.*;
public class rhombus{
    public static void main(String args[]) {
    
    //Question 1
        //Print below pattern
        //    *****
        //   *****
        //  *****
        // *****
        int n=5;
        int i=1;
        while (i<=5) {
            for (int j=1;j<=1;j++) {
                for (int l=n-i;l>0;l--) {
                    System.out.print(" ");
                }
                int k=1;

                while (k<=5) {
                    System.out.print("*");
                    k++;
                }
            }
            i++;
            System.out.println();
        }
    }
}
