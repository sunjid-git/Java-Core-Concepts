/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfindingsum2demo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArrayFindingSum2Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        double sum;
        double[] number = new double[5];
        System.out.print("Enter 5 Number's : ");

        number[0] = input.nextDouble();
        number[1] = input.nextDouble();
        number[2] = input.nextDouble();
        number[3] = input.nextDouble();
        number[4] = input.nextDouble();

        sum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("Result : " + sum);
    }

}
