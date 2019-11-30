/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtouppercasemethoddemo;

/**
 *
 * @author Asus
 */
public class StringToUpperCaseMethodDemo {

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
        //showing the upper Case method
        String UpperName = firstName.toUpperCase();
        System.out.println("Name : "+UpperName);
        
        UpperName = lastName.toUpperCase();
        System.out.println("Name : "+UpperName);
        
        
         String LowerName = firstName.toLowerCase();
        System.out.println("Name : "+LowerName);
    }
    
}
