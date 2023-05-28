import java.util.*;
public class decTriangle{
    public static void main(String args[]) {
    
      //Question 4
        //Print the pattern below
        //****
        //***
        //**        
        //*
        for (int i=1;i<=4;i++) {
            for (int j=4;j>=i;j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    
    }
}
