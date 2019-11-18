/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysortinginascendingorderdemo;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class ArraySortingInAscendingOrderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] A= {-2,-1,0,2,1};
        Arrays.sort(A);
        System.out.println("Arrays in Ascending Order : ");
        for (int i = 0; i < 5; i++) {
            System.out.print(" "+A[i]);
        }
        
        
    }
    
}
