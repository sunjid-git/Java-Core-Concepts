/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtablenesteddemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MultiplicationTableNestedDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,m; 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Initial Number : ");
        
        n = input.nextInt();
        
        System.out.print("Enter your Final Number : ");
        
        m = input.nextInt();
        
        
        
        for (int i = n; i <=m; i++) {
            
            for (int j = 1; j <= 10; j++) {
        
               
                
        System.out.println(i+" X "+j+" = "+i*j);
         
            
        }
            System.out.println("\n");
        
        
    }
    
    }