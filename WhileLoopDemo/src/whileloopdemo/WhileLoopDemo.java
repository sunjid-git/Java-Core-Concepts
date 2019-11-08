/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloopdemo;

/**
 *
 * @author Asus
 */
public class WhileLoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1;
        while(i<=10)
        {
            System.out.println(" Result : "+i);
            i++;
        }
       
        System.out.println("\n");
        
        int j=2;
        while(j<=10)
        {
            System.out.println(" Result : "+j);
            j=j+2;
        }
       
         System.out.println("\n");
        
        int k=10;
        while(k>=1)
        {
            System.out.println(" Result Reverse : "+k);
            k--;
        }
        
        
       
    }
    
}
