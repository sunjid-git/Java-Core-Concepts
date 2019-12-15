/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileread;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FileRead {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
        File file = new File("C:/Users/Asus/Documents/NetBeansProjects/FileRead/Sunjid/File.txt");
        Scanner scanner= new Scanner(file);
        
                while(scanner.hasNext())
                {
                       String id = scanner.next();
                       String name = scanner.next();
                       System.out.println("Id : "+id+" Name : "+name);
                }
                scanner.close();
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
