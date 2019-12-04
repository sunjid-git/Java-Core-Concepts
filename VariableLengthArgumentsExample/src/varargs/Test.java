/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargs;

/**
 *
 * @author Asus
 */
public class Test {
    public static void main(String[] args) {
        Add ob = new Add();
        ob.add(10,20);
        ob.add(10,20,30);
        ob.add(10,20,30,40);
        ob.add(10,20,30,40,50);
        ob.add(10,20,30,40,50,60);
    }
}
