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
        display2();
        System.out.println("I am non Static Method");
        System.out.println();
    }
    
    
    //non static member can not acces
    static void display2()
    {
        //display1(); if i undo , it will show error
        System.out.println("I am Static Method");
    }
}
