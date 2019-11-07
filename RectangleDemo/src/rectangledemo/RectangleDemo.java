/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangledemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class RectangleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double length, width,area, perimeter;
        
        System.out.print("Enter Length = ");
        length = input.nextDouble();
        
        System.out.print("Enter Width = ");
        width = input.nextDouble();
        
        area = length*width;
        System.out.println("Area = "+area);
        
        perimeter = 2 * (length + width);
        System.out.println("Perimeter = "+perimeter);
    }
    
}
