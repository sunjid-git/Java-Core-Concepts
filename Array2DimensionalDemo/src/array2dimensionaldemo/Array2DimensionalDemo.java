/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array2dimensionaldemo;

/**
 *
 * @author Asus
 */
public class Array2DimensionalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] number = new int[2][3];
        number[0][0] = 10;
        number[0][1] = 20;
        number[0][2] = 30;
        number[1][0] = 40;
        number[1][1] = 50;
        number[1][2] = 60;

        for (int i = 0; i < 2; i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+number[i][j]);
            }
            System.out.print("\n");
        }

    }

}
