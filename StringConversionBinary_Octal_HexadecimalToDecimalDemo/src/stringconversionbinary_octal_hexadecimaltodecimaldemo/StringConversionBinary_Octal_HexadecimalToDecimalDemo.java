/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringconversionbinary_octal_hexadecimaltodecimaldemo;

/**
 *
 * @author Asus
 */
public class StringConversionBinary_Octal_HexadecimalToDecimalDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String binary ="1010";
        System.out.println("Binary Value : "+binary);
        Integer z =Integer.parseInt(binary,2);
        System.out.println("Binary To Decimal : "+z);
        System.out.println();
        
        String octal ="675";
        System.out.println("Octal Value : "+octal);
        Integer x = Integer.parseInt(octal,8);
        System.out.println("Octal To Decimal : "+x);
        System.out.println();
        
        String hexadecimal= "F";
        System.out.println("Hexadecimal Value : "+hexadecimal);
        Integer y = Integer.parseInt(hexadecimal,16);
        System.out.println("Hexadecimal To Decimal : "+y);
        System.out.println();
    }
    
}
