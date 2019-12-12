/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filegetabsolutepath;

import java.io.File;

/**
 *
 * @author Asus
 */
public class FileGetAbsolutePath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File directory= new File("Sunjid");
        directory.mkdir(); // to create directory
        
        String directory_location = directory.getAbsolutePath();
        System.out.println("Location : "+directory_location);
        
    }
    
}
