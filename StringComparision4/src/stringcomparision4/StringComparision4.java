
package stringcomparision4;


public class StringComparision4 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        String password1 = "sunjid123456";
        String password2 = "Sunjid123456";
        String password3 = new String("Sunjid123456");
        String password4 = new String("Sunjid12345");
        
        System.out.println(password1.equalsIgnoreCase(password2));
        System.out.println(password1.equalsIgnoreCase(password3));
        System.out.println(password1.equalsIgnoreCase(password4));
    }
    
}
