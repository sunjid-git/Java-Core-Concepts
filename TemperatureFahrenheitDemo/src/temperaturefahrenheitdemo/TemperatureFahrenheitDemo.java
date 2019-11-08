/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperaturefahrenheitdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class TemperatureFahrenheitDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double fahrenheit, celsius;
        
        System.out.print("Enter celsius = ");
        celsius = input.nextDouble();
        
        
        
        fahrenheit = 1.8*celsius+32;
        System.out.println("Fahrenheit = "+fahrenheit);
        
    }
    
}
