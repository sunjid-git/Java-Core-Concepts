/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclassstringtoprimitiveconversionmethoddemo;

/**
 *
 * @author Asus
 */
public class WrapperClassStringToPrimitiveConversionMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String s = "32";
        
        int i = Integer.parseInt(s);
        System.out.println("i : "+i);
        
        double d = Double.parseDouble(s);
        System.out.println("d : "+d);
        
        int j =Integer.valueOf(s);
        System.out.println("j : "+j);   
    }
    
}
