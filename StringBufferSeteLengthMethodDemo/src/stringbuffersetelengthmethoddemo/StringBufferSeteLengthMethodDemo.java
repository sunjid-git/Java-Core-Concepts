/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbuffersetelengthmethoddemo;

/**
 *
 * @author Asus
 */
public class StringBufferSeteLengthMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application l ogic here
         StringBuffer sb = new StringBuffer("Sunjid Hasan");
        System.out.println(sb);
        
        //toprint until aspecific index length
        sb.setLength(5);
        System.out.println(sb);
    }
    
}
