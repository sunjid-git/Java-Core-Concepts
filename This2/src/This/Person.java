/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package This;

/**
 *
 * @author Asus
 */
public class Person {
    String name;
    int age;
    String hairColor;
    
    Person(String name, int age)
    {
        this.name =name;
        this.age =age;
    }
    
    Person(String name, int age, String hairColor)
    {
        this.age=age;
        this.name = name;
        this.hairColor = hairColor;
    
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Haircolor : "+hairColor);
    }
}
