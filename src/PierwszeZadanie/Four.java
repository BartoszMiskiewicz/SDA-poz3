package PierwszeZadanie;

import java.util.Scanner;

/**
 * Created by bartosz on 09.04.2017.
 */
public class Four {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert value in fahrenheit: ");
//        System.out.println("Insert value in celsius: ");
//        int fahrenheit = scanner.nextInt();
//        int celsius = scanner.nextInt();
//        celsiustToFarenheit(celsius);
//        int a = 80;
//        farenheitToCelsius(a);
//        farenheitToCelsius(fahrenheit);
//        farenheitToCelsius(70);
//        minmax(1,2,3);
//        System.out.println();
//        minmax(1,1,2);

//        int number1, number2, number3;// definiowanie rodzaju danych
//        Scanner scanner = new Scanner(System.in); // funkcja pobierania danych
//        System.out.println("Insert first number: "); // infomacja co robimy na konsoli
//        number1 = scanner.nextInt(); // pobieranie danych
//        System.out.println("Insert second number: ");
//        number2 = scanner.nextInt();
//        System.out.println("Insert third number: ");
//        number3 = scanner.nextInt();
//        minmax(number1, number2, number3); // przypisuje wartosci z konsoli od uzytkowania do metod ponizej


        Scanner scanner = new Scanner(System.in); // skaner zeby gadac z uzytkownikiem
        System.out.println("Podaj wage:>>> "); // pytanie wyswietla na konsole
        int weigh = scanner.nextInt(); // zczytanie zmiennej waga i zczytanie jej
        System.out.println("Podaj wzrost w 'cm'>>>");
        double heightInMeters= scanner.nextDouble(); // next Doubel bo liczby sa po przecinku
        bmi(weigh, heightInMeters); // przypisanie zmiennych w przypadku konsoli podajemy po przecionku wartosi , w przypadku pisania w Java po kropce



    }

//    public static void farenheitToCelsius(int fahrenheit) {
//        double celsius = (fahrenheit - 32) / 1.8;
//        System.out.println(fahrenheit + "F = " + celsius + "C");
//    }

//    public static void celsiustToFarenheit(int celsius) {
//        double farenheit = 1.8 * celsius + 32;
//        System.out.println(celsius + "C = " + farenheit + "F");
//    }

//    public static void minmax(int a, int b, int c) { // odwolanie do main do poszczegolnych liczb
//        int min, max;
//        if (a >= b && a >= c) {
//            max = a;
//        } else if (b >= a && b >= c) {
//            max = b;
//        } else  {
//            max = c;
//        }
//
//        if (a <= b && a <= c) {
//            min = a;
//        } else if (b <= a && b <= c){
//            min = b;
//        } else {
//            min = c;
//        }
//
//        System.out.println("Min value: " + min);
//        System.out.println("Max value: " + max);
//
//    }

    public static void bmi(int weight, double heightInMeters){

        double bmi = weight / (heightInMeters * heightInMeters); // do kwadratu mnozymy cos przez cos obliczanie waga podzielona przez waga do kwadratu  i porownujemy
        System.out.println("Twoje bmi to: " + bmi);
        if ( bmi < 18.5) { // waga jest prawidlowa
            System.out.println("Masz niedowage");
        } else  if (bmi >= 18.5 && bmi <= 24.9) { //jezel wyjdziem poza zakres podany przez I mniejsze równe 24,9 wtedy otrzymamy Masz nadwage, kiedy bedzie mniejsza nie wyejdziemy w ta petle
            System.out.println("Twoja waga jest Ok");
        } else {
            System.out.println("Masz nadwage");
        }
    }


}

