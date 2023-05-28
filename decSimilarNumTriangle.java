import java.util.*;
public class decSimilarNumTriangle{
    public static void main(String args[]) {
    
      //Question 1
        //Print pattern below
        //11111
        //222
        //33
        //4
        int n=4;
        for (int i=1;i<=n;i++) {
            if (i==1) {
                System.out.print(i);
                
            }
            for (int f =1;f<=n-i+1;f++) {
                System.out.print(i);
            }
            System.out.println();
        }
    
    }
}
