/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overload;

/**
 *
 * @author Asus
 */
public class Overload {
    // no int type parameter yet it will convert
    void add(double a, double b)
    {
        System.out.println(a+b);
    }
    void add(int a, int b, int c)
    {
        System.out.println(a+b+c);
    }
    void add()
    {
        System.out.println("Nothing to add");
    }
}
