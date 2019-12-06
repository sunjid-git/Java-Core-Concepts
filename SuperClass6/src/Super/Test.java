/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Super;

/**
 *
 * @author Asus
 */
public class Test {
     public static void main(String[] args) {
        Car ob = new Car("White", 350, 5);
        ob.attribute();
        
        Vehicle ob1 = new Vehicle("White", 350);
        ob1.attribute();
    }
}
