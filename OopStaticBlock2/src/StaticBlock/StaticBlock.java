
package StaticBlock;


public class StaticBlock {
    
    //it will generate second
    public static void main(String[] args) {
        System.out.println("Main Method");
    }
    //it will generate first
    static
    {
        System.out.println("Static Block");
    }
    
    
}
