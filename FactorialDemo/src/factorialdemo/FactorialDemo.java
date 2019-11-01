/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FactorialDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,fact=1; 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Series Size : ");
        
        n = input.nextInt();
        
        for (int i = n; i >=1; i--) {
            
            
            
            
            System.out.print(i+" X ");
            fact=fact*i;
          
        }
        System.out.println();
        
        System.out.println("Result : "+fact);
    }
    
}
