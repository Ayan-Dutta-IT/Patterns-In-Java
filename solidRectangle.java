import java.util.*;
public class solidRectangle{
    public static void main(String args[]) {
    
      //Question 1
        //Print the pattern below
        //*****
        //*****
        //*****
        //*****
        int n=4;
      for (int i=1;i<=n;i++) {
          for (int j=1;j<=n+1;j++) {
              System.out.print("*");
          }
          System.out.println();
      }
    }
}
