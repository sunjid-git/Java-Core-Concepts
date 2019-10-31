/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhileloopdemo;

/**
 *
 * @author Asus
 */
public class DoWhileLoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int i=1;
        do{
            System.out.println("Result Increment : "+i);
            i++;
        }while(i<=10);
        
        System.out.println("\n");
        
         int j=2;
        do{
            System.out.println("Result Increment with Two : "+j);
            j=j+2;
        }while(j<=10);
        
        System.out.println("\n");
        
         int k=10;
        do{
            System.out.println("Result Reverse : "+k);
            k--;
        }while(k>=1);
        
        
        
    }
    
}
