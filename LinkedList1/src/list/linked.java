/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class linked {
    public static void main(String[] args) {
        LinkedList<String>  countryName = new LinkedList<String>();
        countryName.add("Sunjid");
        countryName.add("Hasan");
        countryName.add("Mafi");
        
        for(String country : countryName)
        {
            System.out.println(countryName);
        }
    }
}
