/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumdemo2;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class SumDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sum1=0,m,n;
        
        System.out.print("Enter M number : ");
        
        Scanner input = new Scanner(System.in);
        
        m =input.nextInt();
        
        System.out.print("Enter N number : ");
        
        n=input.nextInt();
        
        for (int k = m; k < n; k++) {
            sum1 = sum1 +k;
        } System.out.println("Result : "+sum1);
    }
    
}
