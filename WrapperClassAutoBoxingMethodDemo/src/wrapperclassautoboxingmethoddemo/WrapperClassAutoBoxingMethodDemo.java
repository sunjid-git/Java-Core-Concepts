/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclassautoboxingmethoddemo;

/**
 *
 * @author Asus
 */
public class WrapperClassAutoBoxingMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //primitive to -->object
        int x= 30;
        
        //mehtod 1
        Integer y =Integer.valueOf(x);
        System.out.println("y : "+x);
         //mehtod 2
        Integer z = x; //integer.valueOf autoboxing
        System.out.println("z : "+z);
        
    }
    
}
