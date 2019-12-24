/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistadd;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class ArrayListAdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         LinkedList<String>  countryName = new LinkedList<String>();
        countryName.add("Sunjid");
        countryName.add("Hasan");
        countryName.add("Mafi");
        countryName.add(3,"BD");
        
        for(String country : countryName)
        {
            System.out.println(country);
        }
        System.out.println("Size of the List : "+countryName.size());
    }
    
}
