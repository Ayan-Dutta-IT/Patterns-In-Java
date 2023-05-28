import java.util.*;
public class decNumTriangle{
    public static void main(String args[]) {
    
    //Question 7
        //Print the pattern below
        //12345
        //1234
        //123       
        //12
        //1
        int a=1;
        int i=1;
        while (i<=5) {
            for (int j=5;j>=i;j--) {
                System.out.print(a);
                a=a+1;
            }
            i++;
            System.out.println();
            a=1;
        }
    }
}
