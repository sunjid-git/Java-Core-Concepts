/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritence;

/**
 *
 * @author Asus
 */
public class Teacher extends Person {
    //name, age, displayInformation1()
    
    String qualification;
    void displayInformation2()
    {
        System.out.println("Qualification : "+qualification);
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
    
}
