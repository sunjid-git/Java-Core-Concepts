/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcontainsmethoddemo;

/**
 *
 * @author Asus
 */
public class StringContainsMethodDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "Sunjid";
        String s2 = new String ("Sunjid");
        System.out.println("s1 : "+s1);
        System.out.println("s2 : "+s2);
        
        int length = s1.length();
        System.out.println("Length of S1 : "+length);
        
        length = s2.length();
        System.out.println("Length of S2 : "+length);
        
        if(s1.equals(s2))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        
        
        if(s1.contains(s2))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    
}
