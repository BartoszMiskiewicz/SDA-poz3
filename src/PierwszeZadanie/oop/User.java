package PierwszeZadanie.oop;

/**
 * Created by bartosz on 24.04.2017.
 * a klasach mozemy miec pola i takze metody i grupuja pola
 *
 * klasa to jest .....
 * wszystkie metody dobrze jaka sa w tej klasie
 * ruzniaca pomiecy statycznymi i nie statycznymi jaet taka ze nie odwouje sie do danego projektu i klasy tylko wywoluje sie metody
 */
public class User {//klasa
    public String firstName; //metoda
    public String lastName;//metoda
    public String phoneNumber;//metoda
//    public String address;//metoda
    public int age; //metoda
    public Address address;

    public void date(){
        System.out.println(firstName + " " + lastName);
        System.out.println(phoneNumber + " " + age);
    }
}


