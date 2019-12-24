
public class OverloadingConstructorTest {
    public static void main(String[] args) {
        Teacher teacher1= new Teacher();
        Teacher teacher2= new Teacher("Sunjid","Male");
        teacher2.displayInformation();
        Teacher teacher3= new Teacher("Hasan","Male",01521);
        teacher3.displayInformation();
    }
}
