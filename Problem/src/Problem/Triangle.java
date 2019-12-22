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
public class Triangle extends Shape{
    // dim1, dim2
    Triangle(double dim1, double dim2)
    {
    super(dim1, dim2);
    }
    
    @Override
    void area()
    {
        double result = 05*dim1*dim2;
        System.out.println("Triangle : "+result);
    }
}
