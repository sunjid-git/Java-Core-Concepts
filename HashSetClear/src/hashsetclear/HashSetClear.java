/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashsetclear;

import java.util.HashSet;

/**
 *
 * @author Asus
 */
public class HashSetClear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashSet<String> fruitName = new HashSet<String>();
        fruitName.add("Sunjid");
        fruitName.add("Hasan");
        fruitName.add("Mafi");
        
        System.out.println("Before : "+fruitName);
        
        
        
        fruitName.clear();
        System.out.println(fruitName);
    }
    
}
