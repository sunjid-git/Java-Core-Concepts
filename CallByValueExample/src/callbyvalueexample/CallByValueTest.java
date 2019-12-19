/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package callbyvalueexample;

/**
 *
 * @author Asus
 */
public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue ob = new CallByValue();
        int x = 10;
        System.out.println("X before call : "+x);
        ob.change(x);
        System.out.println("X after Call : "+x);
    }
}
