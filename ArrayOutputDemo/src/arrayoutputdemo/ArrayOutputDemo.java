/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayoutputdemo;



/**
 *
 * @author Asus
 */
public class ArrayOutputDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k=0;
        int[][] A=new int[4][5];
        
        System.out.println("Input : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
               A[i][j]=k;
               k++;
            } 
        }
        //to show
        System.out.println("Matrix : ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" "+A[i][j]);
            }
            System.out.print("\n");
        }
    
    
    }
    
}
