/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumberdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PrimeNumberDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,count=0; 
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your Initial Number : ");
        
        n = input.nextInt();
        
        for (int i = 2; i <n; i++) {            
        
                if(n%i==0)
                {
                    count++;
                    break;

                }
        }   
                if (count==0) 
                    {
                 
                    System.out.println("Prime Number ");
                      
                    }
                
                else
                {
                System.out.println("Not Prime Number ");
                }
        
           
        
        
    }
    
}
