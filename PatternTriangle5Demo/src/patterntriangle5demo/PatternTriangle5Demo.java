/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterntriangle5demo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PatternTriangle5Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        System.out.print("How Many Line's : ");
        
        int n = input.nextInt();
        
        
        for (int row = 1; row <=n; row++)
        {
            for (int col = 1; col <= row; col++)
            {
                if(col%2 !=1)
                
                System.out.print(" 1 ");
                
                if(col%2 == 1)
                
                System.out.print(" 1 ");
            }   
            System.out.println();
        }
        
    }
    
}
