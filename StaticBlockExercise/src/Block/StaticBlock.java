/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Block;

/**
 *
 * @author Asus
 */
public class StaticBlock {
    static int id;
    static String name;
    
    static{
    id = 101;
    name ="Sunjid";
    }
    
    static void display()
    {
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
    }
    
    public static void main(String[] args) {
        StaticBlock.display();
    }
}
