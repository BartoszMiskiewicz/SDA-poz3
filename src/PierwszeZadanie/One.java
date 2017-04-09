package PierwszeZadanie;

import java.security.PublicKey;
import java.util.Scanner;

/**
 * Created by bartosz on 07.04.2017.
 */
public class One {

    public static void main(String[] args){
//        System.out.println("Hell World! :) This is began.");
//        System.out.println("5");
//        int number1 = 6;
//        int number2 = 5;
//        checkAge();
//        isnumberEven();
//        greaterThan0();
//        arrayTest();
//        displyEvenNumbers();
//        listEvenGreaterThan0();
//        sumOfElements();
//        sumOfEvenElements();
//        sumOfAllPositive();
//        avg();
//        sumOfSmallerThan();
        sumOfMultiplication();




//        if (number1 > number2) {
//            System.out.println("Number 1 is bigger" );
//        }else if (number1 == number2) {
//            System.out.println("Number are equel " );
//        } else {
//            System.out.println("Number 2 is bigger");
//        }



    }

//    public static void checkAge() {
//        int age = 20;
//        if (age >= 18) {
//            System.out.println("Age are over 18: " + age);}
//            else {
//            System.out.println("Age are under 18" + age);
//        }
//
//    }

//    public static void isnumberEven(){
//        int number = 5;
//        if (number % 2 == 0) {
//            System.out.println("***Number is even***: " + number);
//        }else {
//            System.out.println("***Number is odd***: " + number);
//        }
//
//
//    }

//    public static void arrayTest() {
//        int[] array = {-1,2,-3,4,-5,6,7,-8,9,0};
//        for (int i = 0 ; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//    }

//    public static void displyEvenNumbers() {
//        int[] array = {-1,2,3,6,7,0,-30};
//        for (int i = 0 ; i < array.length; i++ ) {
//            if (array[i] % 2 == 0){
//                System.out.println(array[i]);
//            }
//        }
//
//    }

//    public static void listEvenGreaterThan0() {
//        int [] array = {-1,-2,3,7,8,9,20,50,0};
//        for (int i = 0 ; i < array.length; i++) {
//            if (array[i] > 0 && array[i] % 2 == 0) {
//                System.out.println(array[i]);
//            }
//        }
//    }

//    public static void sumOfElements() {
//        int [] array = {10,11,2,3,4,5,6,9};
//        int sum = 0;
//        for (int i = 0 ; i < array.length; i++) {
//            sum += array[i];
//            }
//        System.out.println(sum);
//
//
//    }

//    public static void sumOfEvenElements() {
//        int[] array = {10, 11, 23, 24, 25, 6, 8, -2, -3, -8};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0 && array[i] % 2 == 0) {
//                sum += array[i];
//            }
//
//            System.out.println("Sum all even elements: " + sum);
//        }
//    }

//    public static void sumOfAllPositive() {
//        int[] array = {10,2,3,4,5,6,-3,-5,-6,-2};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 0 ){
//                sum += array[i];
//            }
//            System.out.println("Sum all elements: " + sum);
//        }

//    }
//    public static void avg(){
//        int[] array = {10,2,5,7,6,8,2,5,7,4};
//        int sum = 0;
//        for (int i = 0; i < array.length; i++){
//            sum += array[i];
//        }
//        System.out.println("Sum of all elements: " + sum);
//        System.out.println("No of element: " + array.length);
//        System.out.println(sum / (double)array.length);
//    }

//    public static void sumOfSmallerThan(){
//        int number = 6;
//        int sum = 0;
//        for (int i = 1; i < number; i++){
//                sum += i;
//            }
//
//
//        System.out.println("Sum of element smaller than 5 : " + sum);
//
//
//    }

    public static void sumOfMultiplication(){
        int [] array = {1,2,2};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i] * i;
        }
        System.out.println("Sum of Multiplication : " + sum);

    }








}
