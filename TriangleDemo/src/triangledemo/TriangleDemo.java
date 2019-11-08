/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangledemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TriangleDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double base, height, area;
        
        System.out.print("Enter Base value = ");
        base= input.nextDouble();
        
        System.out.print("Enter Height = ");
        height = input.nextDouble();
        
        area = 0.5*(base*height);
        
        System.out.println("Area = "+area);
    }
    
}
