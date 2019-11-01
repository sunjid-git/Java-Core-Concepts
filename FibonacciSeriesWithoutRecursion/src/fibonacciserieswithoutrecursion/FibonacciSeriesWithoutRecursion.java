/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacciserieswithoutrecursion;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FibonacciSeriesWithoutRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int first =0;
        int second =1;
        int fibo,n;
        Scanner input =new Scanner (System.in);
        System.out.print("How Many Number's : ");
        n= input.nextInt();
        
        System.out.print(first+" "+second);
        
        for (int i = 3; i < n; i++) {
            
            fibo =first+second;
            
            System.out.print(" "+fibo);
            first=second;
            second =fibo;
            
            
        }
    
    
    
    }
    
}
