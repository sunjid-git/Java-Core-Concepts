
public class mainClass {
    public static void main(String[] args) {
       
        //teacher1
        Teacher teacher1= new Teacher(); //object created
        teacher1.setInformation("Sunjid","male",1);
        teacher1.displayInformation();
        
        //teacher2
        Teacher teacher2= new Teacher(); //object created
        teacher2.setInformation("Hasan","male",2);
        teacher2.displayInformation();

        //teacher3
        Teacher teacher3= new Teacher(); //object created
        teacher3.setInformation("Mafi","male",3);
        teacher3.displayInformation();
    }
}
