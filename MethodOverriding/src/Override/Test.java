/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Override;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
            Teacher ob= new Teacher();
            ob.name = "Sunjid";
            ob.age = 25;
            ob.qualification = "BSc In CSE";
            ob.displayInformation();
            
            Teacher ob1= new Teacher();
            ob1.name = "Hasan";
            ob1.age = 24;
            ob1.qualification = "BSc In CSE";
            ob1.displayInformation();
            
            Person ob2= new Person();
            ob2.name = "Mafi"; 
            ob2.age = 22;
            //ob2.qualification = "BSc In CSE"; // cant do that
            ob2.displayInformation();
    
    }
}
