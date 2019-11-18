
package datedemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {
  
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date();
        System.out.println(date);
        
        //another format
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
        String currentDate = dateFormat.format(date);
        System.out.println("Current Date : "+currentDate);
    }
    
}
