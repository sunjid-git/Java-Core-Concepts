/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        MobileUser mu; // reference variable
        mu = new Sunjid();
        mu.sendMessage();
        
        mu = new Hasan();
        mu.sendMessage();
    }
}
