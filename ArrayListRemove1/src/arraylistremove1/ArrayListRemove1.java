/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistremove1;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class ArrayListRemove1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her  e
        LinkedList<String>  countryName = new LinkedList<String>();
        
        countryName.add("Sunjid");
        countryName.add("Hasan");
        countryName.add("Mafi");
        countryName.add("Bangladesh");
        countryName.add("Army");
        countryName.add("International");
         countryName.remove(1);
        
        
        for(String country : countryName)
        {
            System.out.println(country);
        }
    }
    
}
