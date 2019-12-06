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
public class B extends A {
    //int x=10;
    int x=5;
    
    void display()
    {
        System.out.println("X : "+super.x);
        System.out.println("X : "+x);
    }
            
}
