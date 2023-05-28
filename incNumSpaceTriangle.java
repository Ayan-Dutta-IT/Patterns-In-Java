import java.util.*;
public class incNumSpaceTriangle{
    public static void main(String args[]) {
    
    //Question 8
        //Print the pattern below
        //1
        //2 3
        //4 5 6      
        //7 8 9 10
        //11 12 13 14 15
        int op=1;
        int i=1;
        while (i<=5) {
            for (int j=1;j<=i;j++) {
                System.out.print(op+" ");
                op++;
            }
            i++;
            System.out.println();
        }
    
    }
}
