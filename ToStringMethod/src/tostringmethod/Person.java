/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostringmethod;

/**
 *
 * @author Asus
 */
public class Person {
    String name;
    int age;
    Person(String name, int age)
    {
    this.name= name;
    this.age=age;
    }
    
    @Override
    public String toString()
    {
    return "Name : "+name+"\nAge :"+age;
    }
}
