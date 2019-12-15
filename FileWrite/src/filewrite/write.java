/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewrite;

import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 * 
 * @author Asus
 */
public class write {
    public static void main(String[] args) {
        
        try{
        Formatter formatter = new Formatter("C:/Users/Asus/Documents/NetBeansProjects/FileWrite/Sunjid/File.txt");
        formatter.format("%s %s \r\n","82"," - Sunjid");
        formatter.format("%s %s \r\n","138"," - Hasan");
        formatter.format("%s %s \r\n","04"," - Mafi");
        
        formatter.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("Exception "+e);
        }
    
    }
}
