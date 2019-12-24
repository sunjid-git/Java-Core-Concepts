/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopintroduction;

/**
 *
 * @author Asus
 */
public class AnotherClass {
    public static void main(String[] args) {
        //teacher1
        Teacher teacher1;//object declacre
        
        teacher1= new Teacher(); //object created
        
        teacher1.name="Sunjid";
        teacher1.gender="Male";
        teacher1.phone=1521417063;
        
        System.out.println("Name : "+teacher1.name);
        System.out.println("Name : "+teacher1.gender);
        System.out.println("Name : "+teacher1.phone);
        
        System.out.println();
        
            //teacher2
        Teacher teacher2;//object declacre
        
        teacher2= new Teacher(); //object created
        
        teacher2.name="Hasan";
        teacher2.gender="Male";
        teacher2.phone=1770981999;
        
        System.out.println("Name : "+teacher2.name);
        System.out.println("Name : "+teacher2.gender);
        System.out.println("Name : "+teacher2.phone);
    }
}
