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
    
    Person(String name, int age)
            //Person(String n, int a)
    {
        //name =n;
        //age =a;
        this.name =name;
        this.age =age;
        
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
