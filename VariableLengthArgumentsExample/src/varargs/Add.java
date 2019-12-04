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
public class Add {
    void add(int ... num) // 3 dot means any number
    {
        int sum = 0;
        for (int x: num) {
            sum =sum+x;
        }
        System.out.println("Sum : "+sum);
    }
 
}
