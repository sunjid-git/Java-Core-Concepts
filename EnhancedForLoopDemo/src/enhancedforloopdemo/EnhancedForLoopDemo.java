/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enhancedforloopdemo;

/**
 *
 * @author Asus
 */
public class EnhancedForLoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] names = { "A","B","C","D","E"};
        
        int[] num ={1,2,3,4,5,6,7,8,9,0};
          int sum=0;
       
        System.out.println("Array Size for NAMES : "+names.length);
        System.out.println("Array Size for NUMBER : "+num.length);
        
        
        for (String x : names) {
            System.out.print("\t"+x);
        }
        System.out.println("\n");
        
      
        
        for(int y: num)
        {
            System.out.print("\t"+y);
        }
        
        for(int y: num)
        {
            sum=sum+y;
        }
        System.out.println("\n");
        System.out.println("Result : "+sum);
    }
    
}
