/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathdemo;

/**
 *
 * @author Asus
 */
public class MathDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=4;
        int y=8;
        
        int max =Math.max(x, y);
        
        System.out.println(" Result Max : "+max);
        
        int min=Math.min(x, y);
        
        System.out.println(" Result Min : "+min);
        
        int absolute=Math.abs(y);
        
        System.out.println(" Result Absolute : "+absolute);
        
        double power = Math.pow(x, y);
        
        System.out.println("Result Power : "+power);
        
        double round = Math.round(8.8f);
        
        System.out.println("Result Round : "+round);
        
        double pi = Math.PI;
        System.out.println(" Result PI : "+pi);
        
        
        
        
        
        
    }
    
}
