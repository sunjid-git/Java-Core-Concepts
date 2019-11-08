/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelconsonentdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class VowelConsonentDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner (System.in);
        char ch;
        System.out.print("Enter Any Letter ");
        ch = input.next().charAt(0);
        
        if(ch=='a')
        {
        System.out.print(" Vowel ");
        }
        
        else if(ch=='e')
        {
        System.out.print(" Vowel ");
        }
        
        else if(ch=='i')
        {
        System.out.print(" Vowel ");
        }
        
        else if(ch=='o')
        {
        System.out.print(" Vowel ");
        }
        
        else if(ch=='u')
        {
        System.out.print(" Vowel ");
        }
        
        else 
        {
        System.out.print(" Consonent ");
        }
    }
    
}
