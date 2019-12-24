
package ReturningValue;


public class Test {
    public static void main(String[] args) {
        
        //declaring object
        ReturningValueDemo ob1 = new ReturningValueDemo();
        int result = ob1.square(5);
        System.out.println("Result : "+ob1.square(5));
        
        //more efficient
        ReturningValueDemo ob2 = new ReturningValueDemo();
        System.out.println("Result : "+ob2.square(6));
        
    }
}
