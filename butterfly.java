import java.util.*;
public class butterfly{
    public static void main(String args[]) {
    
    //Question 2
        //Print pattern below
        //*      *
        //**    **
        //***  ***
        //********
        //********
        //***  ***
        //**    **
        //*      *



        int n=4;
        for (int i=1;i<=n;i++) {           
            for (int j=1;j<=i;j++) {
                //System.out.print("*");
            }
          int op=2*n-2*i;
            for (int d=1;d<=op;d++) {
                System.out.print(" ");
           }
            for (int c=1;c<=i;c++) {
              System.out.print("*");
            }
            System.out.println();  
        }



        int m=4;
        for (int i=1;i<=m;i++) {           
           for (int j=1;j<=m-i+1;j++) {
                System.out.print("*");
            }

            for (int d=1;d<=2*i-m+2;d++) {
                System.out.print(" ");
           }
            for (int c=1;c<=m-i+1;c++) {
              System.out.print("*");
            }
            System.out.println();  
        }
    }
}
