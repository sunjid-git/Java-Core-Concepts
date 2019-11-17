/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistusingiteratordemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Asus
 */
public class ArrayListUsingIteratorDemo {

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
        number.add(3 ,40);
           
        Iterator itr = number.iterator();
        while(itr.hasNext())
        {
            System.out.print(" "+itr.next());
        }
        System.out.println();
        System.out.println("Size of the Array List : "+number.size());

    }
    
}
