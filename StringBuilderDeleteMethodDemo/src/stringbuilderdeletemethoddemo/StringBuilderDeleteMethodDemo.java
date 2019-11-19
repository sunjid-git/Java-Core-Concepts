/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuilderdeletemethoddemo;

/**
 *
 * @author Asus
 */
public class StringBuilderDeleteMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuilder str = new StringBuilder("Sunjid");
        System.out.println(str);
        
        str.append(" Hasan");
        str.delete(0,3);
        System.out.println(str);
    }
    
}
