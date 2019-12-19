/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritence;

/**
 *
 * @author Asus
 */
public class Teacher extends Person{
    //getname, setname, setage, getage
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    void displayInformation()
    {
        System.out.println("Name : "+getName());
        System.out.println("Age : "+getAge());
        System.out.println("Qualification : "+getQualification());
        System.out.println();
    }
   
}
