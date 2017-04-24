package PierwszeZadanie;

import java.io.*;
import java.util.Scanner;

/**
 * Created by bartosz on 21.04.2017.
 */
public class Eleven {
    public static void main(String[] args) throws IOException {
        File file = new File("/Volumes/Dane/JavaProgramowanie/file");
//        readFromFileTest(file);
//        writeToFileTest(file, "Hello World");
//        readIntegerFromFile(file);
//        System.out.println(countOddIntegers(file));
        System.out.println(countWordsIn(file));
    }

    public static int[] readIntegerFromFile(File file) throws FileNotFoundException {
        int[] array = new int[getLength(file)];
        Scanner scanner = new Scanner(file);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int countWordsIn(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int counter = 0;

        while (scanner.hasNext()){
            scanner.next();
                counter++;

        }
        return counter;

    }

    public static int countOddIntegers(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        int counter = 0;
        while(scanner.hasNext()){
            if(scanner.nextInt() % 2 ==1) {
                counter++;
            }
        }
        return counter;
    }


    public static int getLength(File file) throws FileNotFoundException { //okresla wielkosc tabliczy
        Scanner scanner = new Scanner(file);
        int counter = 0;
        while (scanner.hasNext()){
            counter++;
            scanner.nextLine();
        }
        return counter;
    }

    private static void readFromFileTest(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {// sprawdza nam jezeli jest nowa linia to zrob do
            System.out.println(scanner.nextLine()); //wypisz wszystko z pliku hellotext
        }
    }

    private static void writeToFileTest(File file, String message) throws IOException{
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter out = new PrintWriter(bw)) {
            out.println(message);

        }
        System.out.println(message);
        // try (ajdnaskdnaksdm){
        //    asdasa
        // }
    }

}
