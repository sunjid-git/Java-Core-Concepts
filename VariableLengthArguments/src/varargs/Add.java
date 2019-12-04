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
    void add(int num1, int num2)
    {
        int sum =num1+num2;
        System.out.println("Sum : "+sum);
    }
    void add(int num1, int num2,int num3)
    {
        int sum =num1+num2+num3;
        System.out.println("Sum : "+sum);
    }
     void add(int num1, int num2,int num3,int num4)
    {
        int sum =num1+num2+num3+num4;
        System.out.println("Sum : "+sum);
    }
}
