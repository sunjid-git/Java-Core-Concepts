/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticMethod;

/**
 *
 * @author Asus
 */ 
public class StaticMethod {
    void display1()
    {
        display2(); /////// it will work
        System.out.println("I am static method");
    }
    static void display2()
    {
       // display1(); // it wont work
        System.out.println("I am not static method");
    }
}
