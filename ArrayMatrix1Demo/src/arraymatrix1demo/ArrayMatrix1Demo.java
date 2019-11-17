/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymatrix1demo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArrayMatrix1Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
       
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        
        System.out.println("Input for Matrix -  A :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("A[%d][%d] = ",i,j);
                A[i][j]= input.nextInt();
            }
        }
        
        System.out.println("Input for Matrix -  B :");
        for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.printf("B[%d][%d] = ",i,j);
                B[i][j]= input.nextInt();
            }
        }
        
        System.out.println("Print Matrix :  A");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+A[i][j]);
            }
            System.out.print("\n"); 
        }
        
        System.out.println("Print Matrix :  B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+B[i][j]);
            }
            System.out.print("\n");
        }
    }
    
}
