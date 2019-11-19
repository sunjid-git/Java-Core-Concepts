/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbufferdeletemethoddemo;

/**
 *
 * @author Asus
 */
public class StringBufferDeleteMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer sb = new StringBuffer("Sunjid Hasan");
        System.out.println(sb);
        
        //to delete specificindex 
        sb.delete(0, 5);
        System.out.println(sb);
    }
    
}
