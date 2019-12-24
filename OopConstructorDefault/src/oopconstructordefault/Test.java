/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopconstructordefault;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher("Sunjid","Male",01521);
        teacher1.displayInformation();
        
        Teacher teacher2 = new Teacher("Hasan","Male",01770);
        teacher2.displayInformation();
        
        Teacher teacher3 = new Teacher("Mafi","Male",01732);
        teacher3.displayInformation();
        
        Teacher teacher4= new Teacher();
        teacher4.displayInformation();
    }
}
