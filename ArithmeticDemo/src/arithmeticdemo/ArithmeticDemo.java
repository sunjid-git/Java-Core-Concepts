/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmeticdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ArithmeticDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        int a,b,c,c2;
        System.out.print("Input 1 Here\n ");
        a= input.nextInt();
        System.out.print("Input 1 Here \n");
        b=input.nextInt();

       
        
        c=a+b;
         System.out.printf("Result %d \n",c);
        c=a-b;
         System.out.printf("Result %d\n",c);
        c=a*b;
        System.out.printf("Result %d\n",c);
        c2= a/b;
            System.out.printf("Result %d\n",c2);
        c=a%b;
       
        System.out.printf("Result %d\n",c);
        
    }
    
}
