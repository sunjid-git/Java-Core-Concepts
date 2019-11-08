/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whilevsdowhiledemo;

/**
 *
 * @author Asus
 */
public class WhileVsDoWhileDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //while
        int i=11;
        while(i<=10)
        {
            System.out.println("Result : "+i);
            i++;
        }
        System.out.println("\n");
        //DO_WHILE
        int k=11;
        do
        {
            System.out.println("Result : "+k);
            k=k+2;
        }
        while(k<=10);
        
    }
    
}
