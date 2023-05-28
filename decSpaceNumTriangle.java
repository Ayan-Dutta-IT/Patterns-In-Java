import java.util.*;
public class decSpaceNumTriangle{
    public static void main(String args[]) {
    
      //Question 2
        //Print pattern below
        //    1
        //   22
        //  333
        // 4444
        //55555
        int n=5;        
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int c=1;c<=i;c++) {
                System.out.print(i);
            }
            System.out.println();
        }
    
    }
}
