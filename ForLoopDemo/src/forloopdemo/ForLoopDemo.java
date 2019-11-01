/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopdemo;

/**
 *
 * @author Asus
 */
public class ForLoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //printing in both sides
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" Level "+i);
        }
        
        System.out.println("\n");
            //just increment
        for (int i = 0; i <=10; i=i+2) {
            System.out.println(" Result : "+i);
        }
        
         System.out.println("\n");
        //reverse order
        for (int i = 10; i >=1; i--) {
            System.out.println("Result "+i);
            
        }
        
        
    }
    
}
