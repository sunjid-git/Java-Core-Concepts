/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Asus
 */
public class Dog implements Animal {
    @Override
    public void eat()
    {
        System.out.println("Dogs cant eat egg");
    }
}
