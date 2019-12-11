/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling4;

/**
 *
 * @author Asus
 */
public class ExceptionHandling4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
         int[] a = new int [4];
        a[4]=10;
        }
        catch(ArithmeticException e)  // sub class have to write down first
        {
            System.out.println("Exception : "+e);
        }
        catch(ArrayIndexOutOfBoundsException f) // have to use last if used in multiple 
        {
            System.out.println("Exception : "+f);
        }
        finally
        {
        System.out.println("Last line of the program");
        }   
    
    
}
