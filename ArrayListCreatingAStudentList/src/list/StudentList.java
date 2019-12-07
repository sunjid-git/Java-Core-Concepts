/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.LinkedList;

/**
 *
 * @author Asus
 */
public class StudentList {
    
    
    public static void main(String[] args) {
        //student list
        LinkedList<Student> list = new LinkedList<Student>();
        //student creation
        
        Student s1 = new Student(82, "Sunjid", "BSc");
        Student s2 = new Student(138, "Hasan", "HSc");
        Student s3 = new Student(04, "Mafi", "SSc");
        
        //adding student
        list.add(s1);
        list.add(s2);
        list.add(s3);
        
        //information display
        for(Student s : list)
        {
            System.out.println(s.id+" "+s.name+" "+s.className);
        }
    }
}
