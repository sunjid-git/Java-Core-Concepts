
package Hash;

import java.util.HashMap;


public class Hash {
    public static void main(String[] args) {
       
        //put, get
        
        HashMap<Integer,String> customer = new HashMap<Integer, String>();
        
        customer.put(82,"Sunjid");
        customer.put(138,"Hasan");
        customer.put(04,"Mafi");
        
        System.out.println(customer.get(82));
        System.out.println(customer.get(138));
        System.out.println(customer.get(04));
        
    }
}
