/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final;

/**
 *
 * @author Asus
 */
public class University {
     final String name = "BAIUST";
    final String PLACE = "Cumilla";
    static final int fee; //static blank final variable
                    //and have to use sttaic block
    
    static{
    fee=85000;
    } 
    void display()
    {
       
        System.out.println("Name : "+name);
        System.out.println("Fee : "+fee);
        System.out.println("Place : "+PLACE);
    }
}
