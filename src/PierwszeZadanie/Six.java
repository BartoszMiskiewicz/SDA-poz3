package PierwszeZadanie;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by bartosz on 10.04.2017.
 */
public class Six {

    public static void main(String[] args) {
//        Five.displayArray(getArray(10));
//        Five.displayArray(getArray(11));
//        getArray(getArray(10));
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Insert value: ");
//        int someValue = scanner.nextInt();
//        int anotherValue = 24;
//       Five.displayArray(getArray(someValue));
//       Five.displayArray(getArray(anotherValue));

//        Random random = new Random();
        randomTest();
    }

    public static int[] getArray(int value) {


        int size = value / 2 + value % 2;
        int[] array = new int[size];
        for(int i =0 ; i< array.length; ++i) {
            array[i] = 2 * i;
        }

        return  array;

        }

        // oblicz wielkosc talbicy
        // utworzyc nowa tablice
        // w petli ustawic wartosc
        // zwrocic
        // 02468 - dla 10 ,  026810 - dla 11+ valu % 2 +

    public static void randomTest() { // void nieczego nie musi otrzymac poprostu jest int przetrzymuje liczby
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(10) - 5);
        System.out.println(random.nextInt(10) + 5);


    }

    public static int[] getRandomArray(int size, int bound) {
        Random random = new Random();
        int[] array = new int[size]; //chcemy zapisywac do nowej talbicy
        for(int i = 0 ; i < array.length; i++)
        {
            array[i] = random.nextInt(bound);

        }
        return array;


    }






}






