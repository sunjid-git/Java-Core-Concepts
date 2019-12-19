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
        Teacher t1 = new Teacher();
        t1.setName("Sunjid");
        t1.setAge(25);
        t1.setQualification("BSc in CSE");
        t1.displayInformation();
        
        Teacher t2 = new Teacher();
        t2.setName("Hasan");
        t2.setAge(20);
        t2.setQualification("BSc in CS");
        t2.displayInformation();
        
        Teacher t3 = new Teacher();
        t3.setName("Mafi");
        t3.setAge(23);
        t3.setQualification("CSE");
        t3.displayInformation();
        
    }
}
