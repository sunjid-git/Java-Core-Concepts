/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Asus
 */
public abstract class MobileUser {
    
    void call() //non abstract
    {
        System.out.println("Call Method");
    }
    abstract void sendMessage();
}