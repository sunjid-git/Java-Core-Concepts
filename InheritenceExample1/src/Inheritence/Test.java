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
public class Test {
    public static void main(String[] args) {
        Teacher ob1 = new Teacher();
        ob1.name = "Sunjid";
        ob1.age = 25;
        ob1.qualification = "Bsc In CSE";   
        ob1.displayInformation2();   
     
        
        Teacher ob2 = new Teacher();
        ob2.name = "Hasan";
        ob2.age = 24;
        ob2.qualification = "Bsc In CSE";   
        ob2.displayInformation2(); 
        
        
        Teacher ob3 = new Teacher();
        ob3.name = "Mafi";
        ob3.age = 23;
        ob3.qualification = "Bsc In CSE";   
        ob3.displayInformation2(); 
    }
}
