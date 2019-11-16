/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayintroductiondemo;

/**
 *
 * @author Asus
 */
public class ArrayIntroductionDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int[] number = new int[5];
         
         number[0]=10;
         number[1]=20;
         number[2]=30;
         number[3]=40;
         number[4]=50;
         
         int length = number.length;
         
         System.out.println("Array Size : "+length);
         
         System.out.println("Inside : "+number[0]);
        
    
    }
    
}
