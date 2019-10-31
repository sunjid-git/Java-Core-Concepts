/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakdemo;

/**
 *
 * @author Asus
 */
public class BreakDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < 10; i++) {
            if(i==5)
                break;
            System.out.println("Result : "+i);
            
        }
    }
    
}
