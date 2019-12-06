
package Super;


public class Car extends Vehicle{
    //color , weight, attribute()
    int gear;
    
    Car(String c, double w, int g)
    {
        super(c,w);
        gear=g;
    }   
    
    @Override
    void attribute()
    {
        System.out.println("Color : "+color);
        System.out.println("Weight : "+weight);
        System.out.println("Gear : "+gear);
    }
}
