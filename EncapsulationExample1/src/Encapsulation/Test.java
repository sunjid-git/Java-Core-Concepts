/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author Asus
 */
public class Test {
        public static void main(String[] args) {
        Person ob = new Person();
        
        ob.setName("Sunjid");
        System.out.println("Name : "+ob.getName());
        
        ob.setAge(25);
        System.out.println("Age : "+ob.getAge());
        
        ob.setGender("Male");
            System.out.println("Gender : "+ob.getGender());
       
    }
}
