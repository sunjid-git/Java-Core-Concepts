
package StaticKeyword;

public class Student {
    String name;
    int id;
    static String UniversityName = "BAIUST";
    
    Student(String n,int i)
    {
    name=n;
    id=i;
    }
    void displayInformation()
    {
        System.out.println("Name : "+name);
        System.out.println("ID : "+id);
        System.out.println("University Name : "+UniversityName);
        System.out.println();
    }
}
