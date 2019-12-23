/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Teacher t = new Teacher();
        Student s = new Student();
        p.display();
        t.display();
        s.display();
    }
}
