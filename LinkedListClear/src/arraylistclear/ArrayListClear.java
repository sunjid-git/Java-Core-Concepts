/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistclear;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class ArrayListClear {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedList<String>  countryName = new LinkedList<String>();
        
        countryName.add("Sunjid");
        countryName.add("Hasan");
        countryName.add("Mafi");
        countryName.add("Bangladesh");
        countryName.add("Army");
        countryName.add("International");
        
        for(String country : countryName)
        {
            System.out.println(country);
        }
        
          countryName.clear();  
          System.out.println(countryName);
    }
    
}
