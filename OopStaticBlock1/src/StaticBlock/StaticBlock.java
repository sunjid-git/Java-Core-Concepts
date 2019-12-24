
package StaticBlock;

public class StaticBlock {
    
    static int id;
    static String name;
   
    
    static
    {
    id = 101;
    name = "Sunjid";
     
    }
    static void display()
    {
        System.out.println("ID : "+id);
        System.out.println("NAME : "+name);
    }
    
      
    public static void main(String[] args) {
       
        StaticBlock.display();
    }
}
