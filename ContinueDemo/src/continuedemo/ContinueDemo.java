/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continuedemo;

/**
 *
 * @author Asus
 */
public class ContinueDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 11; i < 20; i++) {
            if(i==15)
            continue;
            System.out.println("Result : "+i);
            
        }
        
    }
    
}
