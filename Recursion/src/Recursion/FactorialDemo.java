/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;  

/**
 *
 * @author Asus
 */
public class FactorialDemo {
    int fact(int n)
    {
    if(n==1)
        return 1;
    else 
        return n*fact(n-1);
    }
}
