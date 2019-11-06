/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterntriangle1demo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PatternTriangle1Demo {

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
                System.out.print(" "+col);
            }   
            System.out.println();
        }
    }
    
}
