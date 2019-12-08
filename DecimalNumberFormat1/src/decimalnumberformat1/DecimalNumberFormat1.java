/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimalnumberformat1;

import java.text.DecimalFormat;

/**
 *
 * @author Asus
 */
public class DecimalNumberFormat1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       DecimalFormat ob = new DecimalFormat("0.00");
       double x = 2.967887655;
        System.out.println("X : "+ob.format(x));
    }
    
}
