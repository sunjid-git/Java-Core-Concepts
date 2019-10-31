/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitalsmallletterdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class CapitalSmallLetterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        char ch;
        
        System.out.println(" Enter Any Letter ");
        
        ch = input.next().charAt(0);
        
        if(ch >='a' && ch<='z')
        {
        System.out.println(" Small Letter ");
        }
        else if (ch>='A' && ch<='Z')
        {
        System.out.println(" Capital Letter ");
        }
        else
        {
        System.out.print(" Not a Letter ");
        }
    }
    
}
