/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistusingforeachloopdemo;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ArrayListUsingForEachLoopDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArrayList<Integer> number = new ArrayList<Integer>();
         
        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        
        for(int x: number)
        { 
            System.out.print(" "+x);
        }
        System.out.print("\n");
        System.out.println("Size of the Array List : "+number.size());

    }
    
}
