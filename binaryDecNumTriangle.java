import java.util.*;
public class binaryDecNumTriangle{
    public static void main(String args[]) {
    
      //Question 9
        //Print the pattern below
        //1
        //01
        //101       
        //0101
        //10101
        int n=1;
        int r=0;
        int i=1;
        while (i<=5) {
        for (int j=1;j<=i;j++) {
                int sum=i+j;
                if (sum%2==0) {
                    System.out.print(n);
                }
                else {
                    System.out.print(r);
                    
                }
                
            }
            i++;
            System.out.println();
        } 
    
    }
}
