/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystringdiscendingorderdemo;

import java.util.Arrays;

/**
 *
 * @author Asus
 */
public class ArrayStringDiscendingOrderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] names ={"Sunjid","Hasan","Mafi","Mehedi","Mukta","Noor","Tasrif"};
        Arrays.sort(names);
        System.out.println("String Ascending Order : ");
        for (int i = 6; i >=0 ; i--) {
            System.out.print(names[i]+" ");
        }
    }
    
}
