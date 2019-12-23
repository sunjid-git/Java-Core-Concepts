/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodOverload;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        Overload ob = new Overload();
        ob.add(5,10);
        ob.add(10.5,10.3);
        ob.add(10,20,30);
        ob.add();
    }
}
