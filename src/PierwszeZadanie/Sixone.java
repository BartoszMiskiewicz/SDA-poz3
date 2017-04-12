package PierwszeZadanie;


import java.util.Random;
import java.util.Scanner;

/**
 * Created by bartosz on 11.04.2017.
 */
public class Sixone {


    public static void main(String[] args) {
//        Random random = new Random();
//        int result = game(random.nextInt(100));
//        int result = dualDigits(random.nextInt(20));
//        System.out.println("Your finished in " + result + " steps.");


//        dualDigits(1);
//        System.out.println("3" + numberOfDigits(357));
//        System.out.println("4" + numberOfDigits(3576));
//        System.out.println("5" + numberOfDigits(35761));
//        System.out.println("6" + numberOfDigits(357678));
//        System.out.println("7" + numberOfDigits(3568271));
//        System.out.println("8" + numberOfDigits(35794781));
//        System.out.println("1" + numberOfDigits(3));

//        System.out.println("1" + numberOfDigits(14));
//        System.out.println("2" + numberOfDigits(12));

//        sumOfRandom(10);
//        Five.displayArray(numberToArray(34));
//        Five.displayArray(numberToArray(23));
//        sumOfDigits(12);
//        sumOfDigits(12);



//        System.out.println("15" + sumOfDigits(357));
//        System.out.println("17" + sumOfDigits(3572));
//        System.out.println(sumOfRandom(150));
//        System.out.println(sumOfRandom(150));
//        System.out.println(sumOfRandom(150));
//        Five.displayArray(numberToArray(159));
//        Five.displayArray(numberToArray(357));
//        int[] numberAsArray = numberToArray(357);
//        Five.displayArray(numberAsArray);
//        System.out.println(arrayToNumber(numberAsArray));
        int[] array = {0,2,3,4,5,6,3,6,7,4};
        System.out.println(arrayToNumber(array));






    }

    //357 -> [3,5,7] -> 357
    //997 -> [9,9,7] ->997
    //3215 -> [3,2,1,5] -> 3215
    public static int  arrayToNumber(int[] array) {
        int sum = 0;
        int valueToMultiply = 1;
        for ( int i = 0; i < array.length; i++){
            sum += array[array.length - i - 1] * valueToMultiply;
            valueToMultiply *=10;
        }
        return sum;
    }

    //[3,5,7] -> 357
    //[9,9,7} -> 997
    //[3,2,1,5] -> 3215
    public static int[] numberToArray(int number) {
        int size = numberOfDigits(number);
        int[] array = new int[size];
//        int[] array = new int[numberOfDigits(number)];
        int i =0;
        while ( i< array.length) {
            array[array.length -i -1] = number % 10;
            number /= 10;
            i++;
        }
//            for (int j = 0 ; j < array.length; j++) {
//            array[array.length - i - 1] = number % 10;
//            number /= 10;
//        }
        return  array ;
    }


    public static int dualDigits(int number) {
        Scanner scanner = new Scanner(System.in);
        int numberFromUser = -10;
        int stepsCounter = 20;
        while (numberFromUser != number) {
            System.out.println(number);
            numberFromUser = scanner.nextInt();
            stepsCounter++;

//            if (numberFromUser < number) {
//                System.out.println(numberFromUser);
//            } else if (numberFromUser > number) {
//                System.out.println();
//            }

        }
        return stepsCounter;
    }

//    zadanie domowe
//    -10,20
    public static int sumOfRandom(int value){
        Random random = new Random();
        int sum = 0;
        int i = 0;
        while (sum < value) {
            sum += random.nextInt(30) - 10;
            i++;
        }
        return i;

    }


    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number >0) {
            sum += number % 10;
            number /=10; // number = number /10
        }

        return sum;
    }

    public  static int numberOfDigits(int number) {
//        number = number /10;
//        number = number /10;
//        number = number /10;
        int counter = 0 ;
        while (number != 0) {
            number /= 10;
            counter++;

        }
        return counter;
    }


    public static int game(int number) {
        Scanner scanner = new Scanner(System.in);
        int numberFromUser = -1;
        int stepsCounter = 0;
        while (numberFromUser != number) {
            System.out.println("Insert next number <0-99>: ");
            numberFromUser = scanner.nextInt();
            stepsCounter++;

            if (numberFromUser < number) {
                System.out.println(" Number is to low");
            } else if (numberFromUser > number) {
                System.out.println("Number is to big");
            }

        }
        return stepsCounter;
    }

    public static void whileTest(){
        int number = 10;
        int counter = 0;
        Random random = new Random();
        while (number > 0) {
            counter++;
            number -= random.nextInt(3);
//            number = number - random.nextInt(3);
        }
        System.out.println(counter);
    }

    public static boolean sumUntil(int[] array, int sum) {
        int arraySum = 0;
        int i= 0;
        while (arraySum < sum && i < array.length) {
            arraySum += array[i];
            i++;
        }
//        if (arraySum < sum) {
//            return  false;
//        } else  {
//            return  true ;
//        }
        return  arraySum >= sum;
    }

    public static boolean avgUntil(int[] array, int avg) {
        int arraySum = array[0] ;
        int i =1;
        while (arraySum/i < avg && i< array.length) {
            arraySum += array[i];
            i++;
        }
        return arraySum/i >= avg;
    }

    public static void printPowersOf2(int number) {
        int value = 1;
        while (value < number) {//dopuki wartosc jes mniejsza ni liczba tu 35 // to sa typy bollion
            System.out.println(value); // drukuj liczby na konsoli
            value *= 2; // ma pomnozyc jeszcze do potengi 2 i wypisac
        }
    }

}








