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
public class Triangle extends Shape{
    //area()
    
    double base, height;
    Triangle(double base, double height)
    {
    this.base = base;
    this.height = height;
    }
    
    @Override
    double area()
    {
        System.out.print("Area of Triangle : ");
    return 0.5*base*height;
    }
}
