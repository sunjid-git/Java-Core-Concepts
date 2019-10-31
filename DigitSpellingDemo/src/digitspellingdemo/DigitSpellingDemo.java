/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitspellingdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class DigitSpellingDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int digit;
       
        
        System.out.print(" Enter Any Number : ");
        digit = input.nextInt();
        
        
        switch(digit)
        {
            case 0 :
                System.out.print(" Zero ");
                break;
                
            case 1 :
                System.out.print(" One ");
                 break;
            case 2 :
                System.out.print(" Two ");
                 break;
            case 3 :
                System.out.print(" Three ");
                break;
            case 4 :
                System.out.print(" Four ");
                 break;
            case 5 :
                System.out.print(" Five ");
                 break;
            case 6 :
                System.out.print(" Six ");
                 break;
            case 7 :
                System.out.print(" Seven ");
                 break;
            case 8 :
                System.out.print(" Eight ");
                 break;
            case 9 :
                System.out.print(" Nine ");
                 break;
                 
            default:
            System.out.print(" Not a Digit ");
           
            
        }
        
    }
    
}
