/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box;

/**
 *
 * @author Asus
 */
public class Box {
    double height, width , depth; // instance variable
    
    Box(double height, double width, double depth) // local variable
    {
    this.height =height;
    this.width =width;
    this.depth =depth;
    }
    void displayVol()
    {
    double vol = height*width*depth;
        System.out.println("Volume is : "+vol);
    }
}
