/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package positivedemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PositiveDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.print("Enter Number = ");
        number = input.nextInt();
        
        if(number>0)
            System.out.print(" Positive ");
        
    }
    
}
