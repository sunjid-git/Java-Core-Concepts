/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymatrixsumofdiagonaldemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArrayMatrixSumOfDiagonalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] A= new int[3][3];
        int SumOfDiagonal =0;
        Scanner input= new Scanner(System.in);
        
        //input
        System.out.println("Input : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j]=input.nextInt();
            }
        }
        //to show
        System.out.println("Matrix : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t "+A[i][j]);
            }
            System.out.print("\n");
        }
        //to add diagonal 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              if(i==j)  
              {
                SumOfDiagonal=SumOfDiagonal+A[i][j];
              }
              }
        }
        System.out.print("Result : "+SumOfDiagonal);
        System.out.println("\n");
    }
    
}
