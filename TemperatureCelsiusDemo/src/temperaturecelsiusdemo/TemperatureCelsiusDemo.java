/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturecelsiusdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TemperatureCelsiusDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;
        
        System.out.print("Enter Fahrenheit = ");
        fahrenheit = input.nextDouble();
        
        
        
        celsius = 0.55555*(fahrenheit-32);
        System.out.println("Celsius = "+celsius);
        
        
    }
    
}
