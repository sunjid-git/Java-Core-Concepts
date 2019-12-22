/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverriding;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        
    Person ob1 = new Person();
    ob1.displayInformation();
    
     ob1 = new Teacher();
    ob1.displayInformation();

    
    }
    
}
