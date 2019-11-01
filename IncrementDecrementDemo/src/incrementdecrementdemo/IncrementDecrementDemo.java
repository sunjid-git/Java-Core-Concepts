/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementdecrementdemo;

/**
 *
 * @author Asus
 */
public class IncrementDecrementDemo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int a1=10,b1=10, a2=10,b2=10,x1=10,y1,x2=10,y2;
        
        b1=++a1;
        System.out.println("Result = "+b1);
        b1=a1;
        System.out.println("Result = "+b1);
        
        System.out.println();
        
        b2=a2++;
        System.out.println("Result = "+b2);
        b2=a2;
        System.out.println("Result = "+b2);
        
         System.out.println();
                 
        y1=--x1;
        System.out.println("Result = "+y1);
        y1=x1;
        System.out.println("Result = "+y1);
        
        System.out.println();
        
        y2=x2--;
        System.out.println("Result = "+y2);
        y2=x2;
        System.out.println("Result = "+y2);
        
    }
    
}
