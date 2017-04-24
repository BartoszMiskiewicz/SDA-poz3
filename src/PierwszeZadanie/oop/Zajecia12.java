package PierwszeZadanie.oop;

/**
 * Created by bartosz on 24.04.2017.
 * klasy sluza do opisywania obiektow
 * to powinno byc granuralne
 */
public class Zajecia12 {
    public static void main(String[] args) {
        User user = new User();
        user.firstName = "Jan";
        user.lastName = "Kowalski";
        user.phoneNumber = "1234567890";
        user.address = new Address();
        user.age = 40;
        System.out.println(user.firstName + " " + user.lastName + "age: " + user.age);
        System.out.println("Phone number: " + user.phoneNumber);
        System.out.println("Address: " + user.address);

       Address address = new Address();// adres z malej litery to zmienna metody Adress z duzej litery
       address.city = "Poznan";
       address.street = "Wysoka";
       address.postalCode = "50-400";
       address.flatNumber = 43;
       address.land = "Poland";
        System.out.println();

//        System.out.println(address.land + " " + address.city + ", " + address.street);
//        System.out.print(" " + address.flatNumber + ", ");
//        System.out.println(" " + address.postalCode);
//
        address.display();//wywolujemy metode display na rzecz obiektu adress, zmienna trzyma referencje do obietku
        // , zmienne zawsze piszemy z malych liter
        user.date();


    }


}
