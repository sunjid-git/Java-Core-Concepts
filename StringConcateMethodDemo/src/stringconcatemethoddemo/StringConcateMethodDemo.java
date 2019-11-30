/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconcatemethoddemo;

/**
 *
 * @author Asus
 */
public class StringConcateMethodDemo {

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
        
        fullName = firstName.concat(lastName);
        System.out.println("Name : "+fullName);
    }
    
}
