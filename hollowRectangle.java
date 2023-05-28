import java.util.*;
public class hollowRectangle{
    public static void main(String args[]) {
        
        //Question 2
        //Print the pattern below
        //*****
        //*   *
        //*   *        
        //*****
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int r=sc.nextInt();
        System.out.println("Enter number of columns:");
        int c=sc.nextInt();
        for (int i=1;i<=r;i=i+1) {
            for (int j=1;j<=c;j=j+1) {
                if (j==1) {
                    System.out.print("*");
                }
                else if (j==c) {
                    System.out.print("*");
                }
                else if (i==1) {
                    System.out.print("*");
                }
                else if (i==r) {
                    System.out.print("*");
                }
                else {
                   System.out.print(" ");
                }
            }
            System.out.println();

        }
    
    }
}
