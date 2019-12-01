
package generatingrandomnumberdemo;

import java.util.Random;

public class GeneratingRandomNumberDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rand = new Random();
        int randomNumber = rand.nextInt(10); //0 to 10
        System.out.println("Random Number Type 1 : "+randomNumber);
        
        randomNumber = rand.nextInt(91)+5; // 5 to 10
        System.out.println("Random Number Type 2 : "+randomNumber);
        
        randomNumber = (int) ( Math.random()*10); // 0 to 9
        System.out.println("Random Number Type 3 : "+randomNumber);
        
        randomNumber = (int) ( Math.random()*10)+1; // 0 to 9
        System.out.println("Random Number Type 4 : "+randomNumber);
        
        randomNumber = (int) ( Math.random()*100)+1; // 0 to 9
        System.out.println("Random Number Type 5 : "+randomNumber);
    }
    
}
