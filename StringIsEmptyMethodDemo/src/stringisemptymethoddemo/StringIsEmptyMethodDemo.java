/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringisemptymethoddemo;

/**
 *
 * @author Asus
 */
public class StringIsEmptyMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "Sunjid Hasan";
        String s2 = new String ("");
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
        
        int length = s1.length();
        System.out.println("Length of S1 : "+length);
        
        length = s2.length();
        System.out.println("Length of S2 : "+length);
        //for s1
        boolean empty = s1.isEmpty();
        System.out.println(empty);
        //for s2
        empty = s2.isEmpty();
        System.out.println(empty);
    }
    
}
