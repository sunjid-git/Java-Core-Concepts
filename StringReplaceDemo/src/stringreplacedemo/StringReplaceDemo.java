/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringreplacedemo;

/**
 *
 * @author Asus
 */
public class StringReplaceDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "My Name is Sunjid Hasan";
        System.out.println(s1);
        
        String s2 =s1.replace('i','j');
        System.out.println("Aftyer Replacement : "+s2);
        
    }
    
}
