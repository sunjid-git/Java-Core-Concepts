/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series7demo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Series7Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         double n, sum=1; 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Series Size : ");
        
        n = input.nextDouble();
        
        for (double i = 1.5; i < n; i=i+1) {
            
            
            sum = sum *i;
            
            System.out.print(i+" ");
          
        }
        System.out.println();
        System.out.println("Result : "+sum);
        
    }
    }
    

