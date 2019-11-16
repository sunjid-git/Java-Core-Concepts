/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> number = new ArrayList<Integer>();
         System.out.println("Size of the Array List : "+number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        
        
        System.out.println(number);
        System.out.println("Size of the Array List : "+number.size());

        
    }
    
}
