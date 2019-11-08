/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelconsonentdemo2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class VowelConsonentDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        char ch;
        System.out.println(" Enter Input ");
        ch  = input.next().charAt(0);
        
        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
        System.out.println(" Vowel ");
        
        }
        else
        {
        System.out.println(" Consonent ");
        }
        
        
        
        
        
    }
    
}
