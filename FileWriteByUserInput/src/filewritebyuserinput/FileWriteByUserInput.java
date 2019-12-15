/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filewritebyuserinput;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class FileWriteByUserInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String id, name;

        try {
            Formatter formatter = new Formatter("C:/Users/Asus/Documents/NetBeansProjects/FileWrite/Sunjid/File.txt");

            Scanner input = new Scanner(System.in);
            
            System.out.println("How Many Students?");
            System.out.print("Students Number : ");
            
            int num = input.nextInt();
            for (int i = 0; i < num; i++) {
                
                System.out.print("Id : ");
                id = input.next();

                System.out.print("Name : ");
                name = input.next();

                formatter.format("%s %s \r\n", id, name);
            }

            formatter.close();

        } catch (FileNotFoundException e) {
            System.out.println("Exception " + e);
        }
    }

}
