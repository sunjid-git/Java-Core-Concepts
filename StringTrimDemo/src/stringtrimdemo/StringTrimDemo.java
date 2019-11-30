/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtrimdemo;

/**
 *
 * @author Asus
 */
public class StringTrimDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String country = "      My Name is    Sunjid Hasan    ";
        System.out.println(country);
        
        //it canremove the space of first and last
        String s1 = country.trim();
        System.out.println("After Removing Space : "+s1);
        
        
    }
    
}
