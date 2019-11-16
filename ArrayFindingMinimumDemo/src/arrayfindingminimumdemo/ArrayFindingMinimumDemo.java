/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfindingminimumdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArrayFindingMinimumDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        double[] number = new double[5];
        System.out.print("Enter 5 Number's : ");

        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }

        double min=number[0]; 
        for (int i = 1; i < 5; i++) {
            if(min>number[i])
            {
                min=number[i];
            }
        }
        System.out.println("Minimum Value : "+min);
    }
    
}
