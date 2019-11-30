/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlastindexdemo;

/**
 *
 * @author Asus
 */
public class StringLastIndexDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String country = "My Name is Sunjid Hasan";
        System.out.println(country);
        
        char ch = country.charAt(0);
        System.out.println("Character : "+ch);
        
        int value = country.codePointAt(0);
        System.out.println("Ascii Value: "+value);
        
         int index = country.indexOf("n");
        System.out.println("Index : "+index);
        
        int last_index = country.lastIndexOf("n");
        System.out.println("Index : "+last_index);
        
       
        
    }
    
}
