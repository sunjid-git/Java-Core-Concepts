/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circledemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class CircleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        double radius,  area, perimeter;
        
        System.out.print("Enter Radius : ");
        radius = input.nextDouble();
        
        area= 3.1416*radius*radius;
        
        System.out.println("Area = "+area);
        
        perimeter = 2*3.1416*radius;
        System.out.println("Perimeter = "+perimeter);
    }
    
}
