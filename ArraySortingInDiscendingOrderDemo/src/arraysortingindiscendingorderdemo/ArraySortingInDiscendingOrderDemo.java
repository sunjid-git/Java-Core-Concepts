/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysortingindiscendingorderdemo;

import java.util.Arrays;



/**
 *
 * @author Asus
 */
public class ArraySortingInDiscendingOrderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A= {-2,-1,0,3,2,1};
        Arrays.sort(A);
        System.out.println("Arrays in Discending Order : ");
        for (int i=5; i>=0; i--) {
            System.out.print(" "+A[i]);
        }
        
    }
    
}
