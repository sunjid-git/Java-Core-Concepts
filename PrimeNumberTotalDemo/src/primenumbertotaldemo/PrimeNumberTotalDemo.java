/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbertotaldemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class PrimeNumberTotalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int m,n,count=0,totalPrime=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Initial Value : ");
        m = input.nextInt();
        
         System.out.print("Enter Ending Value : ");
        n = input.nextInt();
        
        System.out.println("Prime Number : ");
        
        for(int i = m; i<=n; i++) {
            
            
            for (int j = 2; j <= i; j++)
                {  
                    if(i%j==0)
                    count++;
                    break;
                }
            
            if(count==0)
            {
                System.out.print(" "+i);
                totalPrime++;
            }
            count=0;
        }
        System.out.println("\n");
        System.out.println("Total Prime : "+totalPrime);
        
    }
    
}
