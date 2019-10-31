/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitwiseoperatordemo;

/**
 *
 * @author Asus
 */
public class BitWiseOperatorDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a=32,b=12,c;
        
        c= a&b;
        System.out.println(" Result a&b = "+c);
        
        c=a|b;
        System.out.println(" Result a|b = "+c);
        
        c=a^b;
        System.out.println(" Result a^b = "+c);
        
        System.out.println("\n");
        
        c=a>>1;
        System.out.println(" Result a>>1 ="+c);
        
        c=a>>2;
        System.out.println(" Result a>>2 ="+c);
        
        c=a>>3;
        System.out.println(" Result a>>3 ="+c);
        
        System.out.println("\n");
        
         c=a<<1;
        System.out.println(" Result a<<1 ="+c);
        
        c=a<<2;
        System.out.println(" Result a<<2 ="+c);
        
        c=a<<3;
        System.out.println(" Result a<<3 ="+c);
    }
    
}
