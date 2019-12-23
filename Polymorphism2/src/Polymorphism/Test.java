/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        Shape ob = new Shape();
        Rectangle ob1 = new Rectangle(10,20);
        Triangle ob2 = new Triangle(10,20);
        
        System.out.println("Shape : "+ob.area());
        System.out.println("Shape Rectangle : "+ob1.area());
        System.out.println("Shape Triangle : "+ob2.area());
        
        
    }
}
