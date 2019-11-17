/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistfindingindexdemo;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ArrayListFindingIndexDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> number = new ArrayList<Integer>();
         System.out.println("Initially Size of the Array List : "+number.size());
        System.out.print("\n");
         
        //adding elements
        number.add(10);
        number.add(20);
        number.add(30); 
        number.add(40); 
        number.add(50); 
        
        System.out.println("Array List Contains After Adding : ");
        System.out.print(number);
        System.out.print("\n");
        System.out.println("Size of the Array List After Adding : "+number.size());
        System.out.print("\n");
        
        int pos = number.indexOf(30);
        System.out.println("Index number : "+pos);
    }
    
}
