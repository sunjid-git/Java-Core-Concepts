
package Inheritence;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("Sunjid");
        t1.setAge(25);
        t1.setQualification("BSc in CSE");
        
        System.out.println("Name : "+t1.getName());
        System.out.println("Age : "+t1.getAge());
        System.out.println("Qualification : "+t1.getQualification());
    }
}
