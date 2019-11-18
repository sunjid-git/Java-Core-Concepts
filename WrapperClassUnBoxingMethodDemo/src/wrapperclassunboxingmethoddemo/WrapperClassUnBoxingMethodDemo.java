/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclassunboxingmethoddemo;

/**
 *
 * @author Asus
 */
public class WrapperClassUnBoxingMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //object --> primitive data type
        Double d =new Double(10.25);
        System.out.println("d : "+d);
        
        double e = d.doubleValue();
        System.out.println("e : "+e);
        
        double f = d;
        System.out.println("f : "+f);
    }
    
}
