package PierwszeZadanie;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

/**
 * Created by bartosz on 08.04.2017.
 */
public class two {

    public static void main(String[] args) {

//        takeNumber();
//        max();
        isNumberEven();

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

    public static void isNumberEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert your number : ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

    }

    public static void



}




