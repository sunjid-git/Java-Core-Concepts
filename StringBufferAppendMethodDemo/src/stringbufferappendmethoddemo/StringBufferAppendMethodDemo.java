/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbufferappendmethoddemo;

/**
 *
 * @author Asus
 */
public class StringBufferAppendMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StringBuffer sb = new StringBuffer("Sunjid");
        System.out.println(sb);
        
        sb.append(" Hasan");
        System.out.println(sb);
        sb.append(" 15");
        System.out.println(sb);
    }
    
}
