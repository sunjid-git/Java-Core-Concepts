/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package series8demo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Series8Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int n, sum=1; 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Series Size : ");
        
        n = input.nextInt();
        
        for (int i = 1; i <= n; i=i+1) {
            
            
            
            
            System.out.print(i+"^2 X ");
            sum = sum*i*2;
          
        }
        System.out.println();
        
        System.out.println("Result : "+sum);
        
        
        
    }
    }
    

