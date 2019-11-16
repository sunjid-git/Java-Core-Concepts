/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfindingaveragedemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArrayFindingAverageDemo {

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

        for (int i = 0; i < number.length; i++) {
            sum = sum + number[i];
        }
        //sum = number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("Resultant SUM : " + sum);
        avg = sum / number.length;
        System.out.println("Resultant Average : " + avg);

    }

}
