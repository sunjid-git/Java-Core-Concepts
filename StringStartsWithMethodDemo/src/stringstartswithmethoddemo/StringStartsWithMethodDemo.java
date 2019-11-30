/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringstartswithmethoddemo;

/**
 *
 * @author Asus
 */
public class StringStartsWithMethodDemo {

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
 
        boolean x = firstName.startsWith("A");
        System.out.println("Name : "+x);
        
        boolean y = firstName.startsWith("S");
        System.out.println("Name : "+y);
    }
    
}
