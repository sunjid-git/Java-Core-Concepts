/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcomparision3;

/**
 *
 * @author Asus
 */
public class StringComparision3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String password1 = "sunjid123456";
        String password2 = "Sunjid123456";
        String password3 = new String("Sunjid123456");
        String password4 = new String("Sunjid12345");
        
        System.out.println(password1.equals(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password1.equals(password4));
    }
    
}
