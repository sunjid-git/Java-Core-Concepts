/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistequalsmethoddemo;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ArrayListEqualsMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
       ArrayList<Integer> number3 = new ArrayList<>();
        
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);
        System.out.println("Array List Number 1 : "+number1);
        
        number2.add(5);
        number2.add(6);
        number2.add(7);
        number2.add(8);
        System.out.println("Array List Number 2 : "+number2);
        
        //to add all value in number 3
        number3.addAll(number1);
        System.out.println("Array List Number 3 : "+number3);
        
        
        //to check if the values are same are not
        boolean equal = number1.equals(number3);
        
        System.out.println("Array List Number Values are same or not : "+equal);
        
        //to check if the values are same are not
        equal = number1.equals(number2);
        
        System.out.println("Array List Number Values are same or not : "+equal);
        
        
    }
    
}
