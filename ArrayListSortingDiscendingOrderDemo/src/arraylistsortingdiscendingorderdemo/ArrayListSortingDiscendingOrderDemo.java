/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistsortingdiscendingorderdemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Asus
 */
public class ArrayListSortingDiscendingOrderDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         ArrayList<Integer> number = new ArrayList<>();
        
        number.add(20);
        number.add(-3);
        number.add(18);
        number.add(92);
        number.add(0);
        number.add(2);
        System.out.println("Array List Before Sorting : "+number);
        
        //for discending
        Collections.sort(number,Collections.reverseOrder());
        System.out.println("Array List After Sorting : "+number);
        
    }
    
}
