/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionarrayindexoutofbound;

/**
 *
 * @author Asus
 */
public class ExceptionArrayIndexOutOfBound {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]= new int[5];
        a[5]=32;
        System.out.println(a[5]);
    }
    
}
