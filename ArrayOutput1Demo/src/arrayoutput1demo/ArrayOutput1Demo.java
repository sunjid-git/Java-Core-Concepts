/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayoutput1demo;

/**
 *
 * @author Asus
 */
public class ArrayOutput1Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k=0;
        int[][] A= new int[4][];
        A[0]=new int[1];
        A[1]=new int[2]; 
        A[2]=new int[3]; 
        A[3]=new int[4]; 
         
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                A[i][j]=k;
                k++;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(" "+A[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
