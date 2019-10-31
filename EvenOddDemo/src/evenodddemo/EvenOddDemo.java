/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evenodddemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class EvenOddDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input= new Scanner(System.in);
        int number;
        System.out.print("Enter The Number = ");
        number = input.nextInt();
        
       
        if(number %2 ==0)
        {
        System.out.println(" Even ");
        }
        else if(number %2 !=0 ) {
        System.out.println("Odd");
        }
       
        

    }
    
}
