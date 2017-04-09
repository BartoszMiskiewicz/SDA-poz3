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


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wage:>>> ");
        int weigh = scanner.nextInt();
        System.out.println("Podaj wzrost w 'cm'>>>");
        double heightInMeters= scanner.nextDouble();
        bmi(weigh, heightInMeters); // przypisanie zmiennych



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

        double bmi = weight / (heightInMeters * heightInMeters);
        System.out.println("Twoje bmi to: " + bmi);
        if ( bmi < 18.5) {
            System.out.println("Masz niedowage");
        } else  if (bmi >= 18.5 && bmi <= 24.9) { //jezel wyjdziem poza zakres podany przez I mniejsze równe 24,9 wtedy otrzymamy Masz nadwage, kiedy bedzie mniejsza nie wyejdziemy w ta petle
            System.out.println("Twoja waga jest Ok");
        } else {
            System.out.println("Masz nadwage");
        }
    }


}

