/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymatrixmultiplicationdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArrayMatrixMultiplicationDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
       
        int[][] A = new int[2][3];
        int[][] B = new int[2][3];
        int[][] C = new int[2][3];
        //input
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
        //To show
        System.out.println("\n");
        System.out.println("A = ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t "+A[i][j]);
            }
            System.out.print("\n"); 
        }
        System.out.println("\n");
        System.out.println("B = ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t "+B[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        //Multiplication
         System.out.println("Result Multiplication A*B : ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j]=A[i][j]*B[i][j];
                System.out.print("\t "+(C[i][j]));
            }
          System.out.print("\n");
        }
    }
    
}
