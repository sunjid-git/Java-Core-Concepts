/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringindexofdemo;

/**
 *
 * @author Asus
 */
public class StringIndexOfDemo {

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
        
        int index = country.indexOf("M");
        System.out.println("Index : "+index);
    }
    
}
