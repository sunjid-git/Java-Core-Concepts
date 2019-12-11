/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling1;

/**
 *
 * @author Asus
 */
public class ExceptionHandling1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
         int x = 10;
        int y = 0;
        int result =x/y;
        System.out.println("Result : "+result);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception : "+e);
        }
        finally
        {
        System.out.println("Last line of the program");
        }
    
    }
    
}
