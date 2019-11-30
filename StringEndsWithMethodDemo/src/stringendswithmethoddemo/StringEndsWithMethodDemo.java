/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringendswithmethoddemo;

/**
 *
 * @author Asus
 */
public class StringEndsWithMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstName = "Sunjid";
        String lastName = " Hasan";
        
        //normally
        String fullName = firstName+lastName;
        System.out.println("Name : "+fullName);
        
        System.out.println("");
        //showing the lower Case method
 
        boolean x = firstName.endsWith("d");
        System.out.println("Name : "+x);
        
        boolean y = firstName.endsWith("S");
        System.out.println("Name : "+y);
        
    }
    
}
