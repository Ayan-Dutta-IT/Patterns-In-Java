import java.util.*;
public class incTriangle{
    public static void main(String args[]) {
    
      //Question 3
        //Print the pattern below
        //*
        //**
        //***        
        //****
        String a="*";
        String b="*";
        for (int i=1;i<=4;i=i+1) {
            System.out.println(a);
            a=a+b;
        }
    
    }
}
