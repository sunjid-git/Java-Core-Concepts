/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigitsdemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class SumOfDigitsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum=0,temp,num,r;
        Scanner input =new Scanner (System.in);
        System.out.print("Input Number : ");
        num= input.nextInt();
        
        temp=num;
        
        while(temp!=0)
        {
            r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println("Sum : "+sum);
        
        
    }
    
}
