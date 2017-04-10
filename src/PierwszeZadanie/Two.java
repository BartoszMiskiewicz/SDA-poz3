package PierwszeZadanie;



import java.util.Scanner;

/**
 * Created by bartosz on 08.04.2017.
 */
public class Two {

    public static void main(String[] args) {

//        takeNumber();
//        max();
//        isNumberEven();
//        sumOddElements();
//        sumEvenElements();
//        displayEvenElements();
//        displayOddElements();
//        increment();
//        multipleBy2();
//        addPreviousElement();
//        incrementElements();
        addElementsMultiplieBy();


    }

//    public static void takeNumber(){
//        int sum = 0;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Inser your number 1: ");
//        int next = scanner.nextInt();
//        Scanner scanner2 = new Scanner(System.in);
//        System.out.println("Inser your number 2:  ");
//        int next2 = scanner.nextInt();{
//            sum += next +next2;
//
//        }
//        System.out.println("Sum of number 1 and number 2: " + sum);
//
//    }

//    public static void max(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert your number 1: ");
//        int number1 = scanner.nextInt();
//        System.out.println("Insert your number 2: ");
//        int number2 = scanner.nextInt();
//        if (number1 > number2) {
//            System.out.println("First number i bigger ");
//        } else if (number1 == number2) {
//            System.out.println("Number are equal");
//        }
//            else {
//            System.out.println("Second number is bigger");
//        }
//
//    }

//    public static void isNumberEven() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert your number : ");
//        int number = scanner.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("Number is even");
//        } else {
//            System.out.println("Number is odd");
//        }
//
//    }
//sumje elementy talbicy
//    public static void sumOddElements() {
//        int[] array = {2,3,4,5,6,7};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 !=0 ) { // to samo co == 1
//                sum += array[i];
//            }
//        }
//        System.out.println(sum);
//
//    }
//zlicza elementy tablicy
//    public static void sumEvenElements() {
//        int[] array = {2,3,4,5,6,7,8,9,22};
//        int counter = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                counter++; // counter = counter +1 lub counter += 1 jezeli chcielibysmy doawac o 2 to wtedy counter +=2
//            }
//        }
//        System.out.println(counter);
//
//    }

//    public static void displayEvenElements() {
//        int[] array = {2,3,4,5,6,7,8,9};
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0){//wyswietla parzyste
//                System.out.println(array[i]);
//            }
//        }
//    }

//    public static void displayOddElements() {
//        int[] array = {2,3,4,5,6,7,8,9};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0){//wyswietla nie parzyste
//                System.out.println(array[i]);
//            }
//        }
//    }


    //    public static void increment() {
//        int[] array = {-2,-4,-3,2,3,4,5};
//        for (int i= 0; i < array.length; i++) {
//            if (array[i] < 0){
//                System.out.println(array[i]-1);
//
//            }
//        }
//
//
//    }
//kazdy element dodatni podzielony przez 3 mnozymy razy 2
//    public static void multipleBy2() {
//        int[] array = {-2,-4,9,12,6,33};
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 3  == 0 && array[i] >0 ){
//                array[i] *= 2;
//                System.out.println(array[i]);
//
//
//            }
//
//        }
//    }

//    public static void addPreviousElement(){
//        int[] array = {1, 2, 3, 4, 6, 7};
//        for (int i = 1; i < array.length; i++) {
//            array[i] += array[i-1];
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//
//
//    }

//    public static void incrementElements() {
//        int [] array = {2,3,4,5,-3,-4,33};
//        for ( int i = 0 ; i < array.length; i++) {
//            if (array[i] < 0 ) {
//                array[i]++;
//            }
//        }
//        for ( int i = 0 ; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }

    public static void addElementsMultiplieBy(){
        Scanner scanner = new Scanner(System.in); //wywolanie metody zczytania
        System.out.println("Insert size of table: "); // prosba o podanie liczb tablicy wyswietlany infomacje na konsoli
        int size = scanner.nextInt(); // definowanie zmiennej, rodzaju liczby tablicy - zczytujemy przechwytujemy z konsoli dane
        int[] array = new int[size]; // wczytanie ilosci elementow tablicy
        for (int i = 0 ; i < array.length; i ++ ){
            System.out.println("Insert next number: "); // prosba o padnie liczb tablicy
            int element = scanner.nextInt(); // zmienna do zapisywania danych w tablicy ,zczytanie liczb do tablicy
            if (i == 0) {
                array[i] = element;}
                else {
                array[i] = array[i-1] * element;
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i ++) {
            sum += array[i];
            if (array[i] % 3 == 0) {//jezlei element z tablicy jest podzielny przez 3 to wtedy zostanie wyswietlony na konsoli
                System.out.println("________________________");
                System.out.println("Your result is :>>> " + array[i]); // wyswietalnie elementow na kosoli podzielnych przez 3
            }
        }
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*");

        System.out.println("Average all by modulo 3  : " + sum / (double)array.length);


    }





}




