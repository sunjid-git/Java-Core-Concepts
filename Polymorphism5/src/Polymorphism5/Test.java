/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism5;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        Shape[] s = new Shape[3];
        s [0] = new Shape();
        s [1] = new Rectangle(10,20);
        s [2] = new Triangle(10,20);
        
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i].area());   
        }       
    }
}
