/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squaredemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class SquareDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        double length ,area, perimeter;
        
        System.out.print("Enter Length = ");
        length = input.nextDouble();
        
        
        
        area = length*length;
        System.out.println("Area = "+area);
        
        perimeter = 4 * length;
        System.out.println("Perimeter = "+perimeter);
    }
    
}
