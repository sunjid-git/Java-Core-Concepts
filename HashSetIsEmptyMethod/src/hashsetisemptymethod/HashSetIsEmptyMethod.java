/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetisemptymethod;

import java.util.HashSet;

/**
 *
 * @author Asus
 */
public class HashSetIsEmptyMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> fruitName = new HashSet<String>();
        fruitName.add("Sunjid");
        fruitName.add("Hasan");
        fruitName.add("Mafi");
        
        System.out.println("Before Clear : "+fruitName);
        
        boolean value1 = fruitName.isEmpty();
        System.out.println("Is Empty : "+value1);
        
        fruitName.clear();
        System.out.println("After Clear : "+fruitName);
        
        boolean value2 = fruitName.isEmpty();
        System.out.println("Is Empty : "+value2);
    }
    
}
