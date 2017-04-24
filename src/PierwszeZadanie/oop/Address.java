package PierwszeZadanie.oop;

/**
 * Created by bartosz on 24.04.2017.
 * przepis na obiekt to klasa , czyli jest to przepis na obiekt to klasa
 */
public class Address {
    public String city;//obiekt
    public String street;
    public int flatNumber;
    public String postalCode;
    public String land;

    public void display(){//metoda
        System.out.println(land + " " + city);
        System.out.println(street + " " + flatNumber + " , " + postalCode);
    }
}
