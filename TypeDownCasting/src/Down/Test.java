/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Down;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        
        Teacher t = (Teacher) new Person();
        t.display();
        
        // it will show runtime error not compile time error
    }
}
