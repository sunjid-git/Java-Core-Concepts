/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Problem;

/**
 *
 * @author Asus
 */
public class Circle extends Shape{
     // dim1, dim2
 
    Circle(double r)
    {
    super(r,r);
    }
    
    @Override
    void area()
    {
        double result = 3.1416*dim1*dim2;
        System.out.println("Circle : "+result);
    }
}
