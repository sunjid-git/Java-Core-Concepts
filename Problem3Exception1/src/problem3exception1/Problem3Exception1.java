/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem3exception1;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Problem3Exception1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=1; 
        do{
            try
            {
             Scanner input = new Scanner (System.in);
        
        System.out.print("Please enter num1 : ");
        int num1 = input.nextInt();
        
        System.out.print("Please enter num2 : "); 
        int num2 = input.nextInt();
        
        int result = num1/num2;
        System.out.println("Result : "+num1+"/"+num2+" = "+result);
            
        count=2;
        }catch(Exception e)
        {
            System.out.println("Exception"+e);
            System.out.println("You must enter integer, please try again");
        }
        }
        while(count==1);
    }
    
}
