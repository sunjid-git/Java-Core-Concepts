/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timedemo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class TimeDemo {

 
    public static void main(String[] args) {
        // TODO code application logic here
        LocalTime time = LocalTime.now();
        System.out.println("Local Time : "+time);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh.mm.ss");
        String formattedTime=time.format(formatter);
        System.out.println("Time : "+formattedTime);
        
    }
    
}
