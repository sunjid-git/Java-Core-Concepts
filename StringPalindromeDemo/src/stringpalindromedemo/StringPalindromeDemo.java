/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringpalindromedemo;

/**
 *
 * @author Asus
 */
public class StringPalindromeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 ="madam";
        StringBuffer s2 = new StringBuffer(s1);
        
        String s3 = s2.reverse().toString();
        
        if(s1.equals(s3))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
        
    }
    
}
