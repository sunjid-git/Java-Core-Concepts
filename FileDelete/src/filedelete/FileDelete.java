/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filedelete;

import java.io.File;

/**
 *
 * @author Asus
 */
public class FileDelete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         File directory= new File("Sunjid");
        directory.mkdir();
        
        String path = directory.getAbsolutePath();
        
        File file1 = new File (path+"/Sunjid.txt");
        File file2 = new File (path+"/Hasan.txt");

        try{
            file1.createNewFile();
            file2.createNewFile();
            
            }catch(Exception e)
            {
                System.out.println("Exception : "+e);
            }
        file2.delete();
        
        if(file2.exists())
        {
            System.out.println("File Exists");
        }
        else
        {
        
            System.out.println(file2.getName()+" - File does not exists.");
        
        }
        
    }
    
}