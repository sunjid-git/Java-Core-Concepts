/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconversiondecimaltobinary_octal_hexadecimaldemo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class StringConversionDecimalToBinary_Octal_HexadecimalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner input = new Scanner(System.in);
         int decimal;
        
         System.out.print("Enter a Decimal Value : ");
        decimal =input.nextInt();
         
        String x = Integer.toBinaryString(decimal);
        System.out.println("Decimal to Binary : "+x);
        
        String y = Integer.toOctalString(decimal);
        System.out.println("Decimal to Octal : "+y);

        String z = Integer.toHexString(decimal);
        System.out.println("Decimal to Hexadecimal : "+z);
        
        
    }
    
}
